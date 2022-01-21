/**
 * @author Brandon Tenorio
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.stream.Collectors;

/**
 * @author Branodn Tenorio
 */
public class MovieTicketManager implements MovieTicketManagerInterface {

    private ArrayList<Ticket> ticketList;
    private DecimalFormat df = new DecimalFormat("##0.00");

    public MovieTicketManager() {
        this.ticketList = new ArrayList<>();
    }

    @Override
    public int numVisits(int id) {
        return (int) ticketList.stream().filter(t -> t.getId() == id).count();
    }

    @Override
    public int numThisMovie(int id, String movie) {
        return (int) ticketList.stream().filter(t -> t.getId() == id && t.getMovie().equals(movie))
                .count();
    }

    @Override
    public int numMoviesToday(int id, int date) {
        return (int) ticketList.stream().filter(t -> t.getId() == id && t.getDay() == date).count();
    }

    @Override
    public double addTicket(String movie, String rating, int day, int time, String format,
                            String buyer, int id) {

        switch (buyer) {
            case "Adult" -> {
                Adult ticketAdult = new Adult(movie, rating, day, toFormat(format), time, id);
                ticketAdult.setPrice(ticketAdult.calculateTicketPrice());
                ticketList.add(ticketAdult);
                return ticketAdult.calculateTicketPrice();
            }
            case "Child" -> {
                Child ticketChild = new Child(movie, rating, day, toFormat(format), time, id);
                ticketChild.setPrice(ticketChild.calculateTicketPrice());
                ticketList.add(ticketChild);
                return ticketChild.calculateTicketPrice();
            }
            case "Employee" -> {
                Employee ticketEmployee = new Employee(movie, rating, day, toFormat(format), time, id);
                if (numVisits(id) < 2) {
                    ticketEmployee.setPrice(0);
                    ticketList.add(ticketEmployee);
                    return 0;
                } else {
                    ticketEmployee.setPrice(ticketEmployee.calculateTicketPrice());
                    ticketList.add(ticketEmployee);
                    return ticketEmployee.calculateTicketPrice();
                }
            }
            case "MoviePass" -> {
                MoviePass ticketMoviePass =
                        new MoviePass(movie, rating, day, toFormat(format), time, id);
                if (numMoviesToday(id, day) == 0 && numThisMovie(id, movie) == 0
                        && ticketMoviePass.getFormat() == Format.NONE) {
                    if (numVisits(id) == 0) {
                        ticketMoviePass.setPrice(9.99);
                        ticketList.add(ticketMoviePass);
                        return 9.99;
                    }
                    ticketMoviePass.setPrice(0);
                    ticketList.add(ticketMoviePass);
                    return 0;
                } else {
                    ticketMoviePass.setPrice(ticketMoviePass.calculateTicketPrice());
                    ticketList.add(ticketMoviePass);
                    return ticketMoviePass.calculateTicketPrice();
                }
            }
        }
        return -1;
    }

    /**
     * Return format value
     * @param str String representing format of movie
     * @return a format following the enum Format
     */
    public static Format toFormat(String str) {
        if (str.equals("3D")) {
            return Format.THREE_D;
        }
        return Enum.valueOf(Format.class, str);

    }

    @Override
    public double totalSalesMonth() {
        return ticketList.stream().mapToDouble(Ticket::getPrice).sum();
    }

    @Override
    public String monthlySalesReport() {

        int adultTickets = (int) ticketList.stream().filter(t -> t.getType().equals("Adult")).count();
        int childTickets = (int) ticketList.stream().filter(t -> t.getType().equals("Child")).count();
        int employeeTickets =
                (int) ticketList.stream().filter(t -> t.getType().equals("Employee")).count();
        int moviePassTickets =
                (int) ticketList.stream().filter(t -> t.getType().equals("MoviePass")).count();

        double adultSales = ticketList.stream().filter(t -> t.getType().equals("Adult"))
                .mapToDouble(Ticket::getPrice).sum();

        double childSales = ticketList.stream().filter(t -> t.getType().equals("Child"))
                .mapToDouble(Ticket::getPrice).sum();

        double employeeSales = ticketList.stream().filter(t -> t.getType().equals("Employee"))
                .mapToDouble(Ticket::getPrice).sum();
        double moviePassSales = ticketList.stream().filter(t -> t.getType().equals("MoviePass"))
                .mapToDouble(Ticket::getPrice).sum();

        double totalSales = adultSales + childSales + employeeSales + moviePassSales;

        String title = "\tMonthly Sales Report\n\n";
        String columns = "\t\t\tSales\tNumber";
        String adultRow = "\nADULT\t\t$" + df.format(adultSales) + "\t\t" + adultTickets;
        String childRow = "\nCHILD\t\t$" + df.format(childSales) + "\t\t" + childTickets;
        String employeeRow = "\nEMPLOYEE\t$" + df.format(employeeSales) + "\t\t" + employeeTickets;
        String moviePassRow = "\nMOVIEPASS\t$" + df.format(moviePassSales) + "\t\t" + moviePassTickets;
        String totalString = "\n\nTotal Monthly Sales $" + df.format(totalSales) + "\n";
        return title + columns + adultRow + childRow + employeeRow + moviePassRow + totalString;
    }

    @Override
    public ArrayList<String> get3DTickets() {
        ArrayList<Ticket> threeDList = new ArrayList<>();
        for (Ticket t:ticketList) {
            if(t.getFormat() == Format.THREE_D) threeDList.add(t);
        }
        threeDList.sort(sortByDay());
        return ticketToString(threeDList);
    }

    @Override
    public ArrayList<String> getAllTickets() {
        ArrayList<Ticket> fullList = new ArrayList<>(ticketList);
        fullList.sort(sortByDay());
        return ticketToString(fullList);
    }

    @Override
    public ArrayList<String> getMoviePassTickets() {

        ArrayList<Ticket> moviePassList = new ArrayList<>();
        for (Ticket t:ticketList) {
            if(t.getType().equals("MoviePass")) moviePassList.add(t);
        }
        moviePassList.sort(sortById());
        return ticketToString(moviePassList);
    }

    @Override
    public void readFile(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String[] ticket = sc.nextLine().split(":");
            addTicket(ticket[0], ticket[1], Integer.parseInt(ticket[2]), Integer.parseInt(ticket[3]),
                    ticket[4], ticket[5], Integer.parseInt(ticket[6]));
        }
        sc.close();
    }

    @Override
    public String toString() {
        return "MovieTicketManager [ticketList=" + ticketList + "]";
    }
    /**
     * Convert a List<Ticket> to a List<String> where String is the String version of Ticket
     * @param list list of Ticket elements to convert
     * @return list of String elements
     */
    private ArrayList<String> ticketToString(ArrayList<Ticket> list){
        return list.stream().map(Ticket::toString).collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * @return List of Tickets
     */
    public ArrayList<Ticket> getTicketList() {
        return ticketList;
    }

    /**
     * Compares tickets by ID
     * @return compares ticket objects by id
     */
    private Comparator<Ticket> sortById(){
        return new Comparator<Ticket>() {
            public int compare(Ticket ticket1, Ticket ticket2) {
                return (ticket1.getId() - ticket2.getId());
            }
        };
    };

    /**
     * Compares tickets by day
     * @return comparator for ticket objects by day
     */
    private Comparator<Ticket> sortByDay() {
        return new Comparator<Ticket>(){
            public int compare(Ticket ticket1, Ticket ticket2) {
                return (ticket1.getDay() - ticket2.getDay());
            }
        };
    }
}