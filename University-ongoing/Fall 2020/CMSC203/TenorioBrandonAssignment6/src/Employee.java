/**
 * @author Brandon Tenorio
 */
public class Employee extends Ticket {

    private final double IMAX_PRICE = 1.5;
    private final double THREE_D_PRICE = 1.25;
    private final double EARLY_PRICE = 5.25;
    private final double LATE_PRICE = 6.75;


    public Employee() {
        super.type = "Employee";
    }

    public Employee(String movieName, String rating, int day, Format format, int time, int id) {
        super(movieName, rating, day, format, time, id);
        super.type = "Employee";
    }

    @Override
    public double calculateTicketPrice() {
        double price;

        if (time < LATE_TIME){
            price = EARLY_PRICE;
        } else {
            price = LATE_PRICE;
        }

        if (format.equals(Format.IMAX)) {
            price += IMAX_PRICE;
        } else if (format.equals(Format.THREE_D)) {
            price += THREE_D_PRICE;
        }
        return price * TAX_FEE;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}