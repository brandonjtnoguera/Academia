/**
 * @author Brandon Tenorio
 */
public class Adult extends Ticket {

    private final double IMAX_PRICE = 3;
    private final double THREE_D_PRICE = 2.5;
    private final double EARLY_PRICE = 10.5;
    private final double LATE_PRICE = 13.5;

    public Adult() {
        super.type = "Adult";
    }

    public Adult(String movie, String rating, int day, Format format, int time, int id) {
        super(movie, rating, day, format, time, id);
        super.type = "Adult";
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
        return -1;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}