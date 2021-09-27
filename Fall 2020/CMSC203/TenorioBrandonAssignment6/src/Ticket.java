import java.text.DecimalFormat;

/**
 * @author Brandon Tenorio
 */

public abstract class Ticket {

    protected String type;
    protected String movie;
    protected String rating;
    protected int day;
    protected Format format;
    protected int time;
    protected int id;
    protected double price;
    protected final double TAX_FEE = 1.096;
    protected final int LATE_TIME = 18;

    public Ticket() {
        this.day = 1;
        this.time = 8;
        this.price = -1;
        this.type = "Ticket";
        this.movie = "";
        this.rating = "";
        this.format = Format.NONE;
    }

    public Ticket(String movieName, String rating, int day, Format format, int time, int id) {
        this.type = "Ticket";
        this.movie = movie;
        this.rating = rating;
        this.day = day;
        this.format = format;
        this.time = time;
        this.id = id;
        this.price = -1;
    }

    public abstract double calculateTicketPrice();

    /** Sets the name of the film
     * @param movie the name of the movie
     */
    public void setMovie(String movie) {
        this.movie = movie;
    }

    /** Sets the rating of the movie
     * @param rating the rating of the movie
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /** Sets the day
     * @param day the day
     */
    public void setDay(int day) {
        this.day = day;
    }

    /** Sets the format
     * @param format the format
     */
    public void setFormat(Format format) {
        this.format = format;
    }

    /** Sets the time
     * @param time the time
     */
    public void setTime(int time) {
        this.time = time;
    }

    /** Sets the price of the movie
     * @param price the price of the mopvie
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /** Sets the ID
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /** Sets the type
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    public abstract int getId();

    /** Returns the name of the movie
     * @return the name of the movie
     */
    public String getMovie() {
        return movie;
    }

    /** returns the rating of the movie
     * @return the rating of the movie
     */
    public String getRating() {
        return rating;
    }

    /** returns the day
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /** returns the format
     * @return the format
     */
    public Format getFormat() {
        return format;
    }

    /** returns the time
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /** returns the price of the movie
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /** returns the type
     * @return the type
     */
    public String getType() {
        return type;
    }


    /**
     * @return the info about ticket and movie
     */
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##0.00");

        String typeID = type.toUpperCase();

        if (getId() != -1) {
            typeID += "-" + id;
        }

        String view = "";
        if (format.equals(Format.THREE_D)) {
            view = "3D";
        } else if (format.equals(Format.IMAX)) {
            view = format.toString();
        }
        return typeID + " " + view + " Movie: " + movie + " Rating: " + rating + " Day: " + day
                + " Time: " + time + " Price: $" + df.format(price);
    }

}
