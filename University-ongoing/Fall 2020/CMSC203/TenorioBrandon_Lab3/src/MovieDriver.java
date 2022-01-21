import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Movie m = new Movie();

        String title, rating, answer;
        int ticketsSold;

        do {
            System.out.println("Enter the name for a movie:");
            title = keyboard.nextLine();
            m.setTitle(title);

            System.out.println("Enter the rating for the movie:");
            rating = keyboard.nextLine();
            m.setRating(rating);

            System.out.println("Enter the number of tickets sold for this movie:");
            ticketsSold = keyboard.nextInt();
            m.setSoldTickets(ticketsSold);

            System.out.println(m.toString());

            System.out.println("Do you want to enter another? (yes or no)");
            answer = keyboard.nextLine();
            answer = keyboard.nextLine();
        }while (answer.charAt(0) == 'y' || answer.charAt(0) == 'Y');
        System.out.println("Goodbye");

        System.out.println("\nName: Brandon Tenorio");
    }
}
