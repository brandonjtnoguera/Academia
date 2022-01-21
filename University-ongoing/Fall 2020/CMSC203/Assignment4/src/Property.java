/**
 * @author brandontenorio
 */
public class Property
{
    private String city;
    private String owner;
    private String propertyName;
    private double rentAmount;
    private Plot plot;

    /**
     * No-arg constructor. Initializes every String to an empty String, rentAmount to 0, and Plot object to its
     * no-arg constructor.
     */
    public Property()
    {
        this.city = "";
        this.owner = "";
        this.propertyName = "";
        this.rentAmount = 0;
        this.plot = new Plot();
    }

    /**
     * A copy constructor that copies the information of the object passed to it
     * @param p: A property object
     */
    public Property(Property p)
    {
        this.city = p.city;
        this.owner = p.owner;
        this.propertyName = p.propertyName;
        this.rentAmount = p.rentAmount;
    }

    /**
     * Parameterized constructor with no info about the plot. Initializes propertyName, city, rentAmount, and owner.
     * @param propertyName Name of the property
     * @param city Name of the city where the property is located
     * @param rentAmount How much the property costs to rent
     * @param owner Name of the property's owner
     */
    public Property(String propertyName, String city, double rentAmount, String owner)
    {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
    }

    /**
     * Parametrized constructor with info about the plot. Initializes propertyName, city, rentAmount, owner, the coordinates for the
     * upper left corner of the plot, as well as the width and depth of the plot.
     * @param propertyName: Name of the property
     * @param city: Name of the city where property is located
     * @param owner: Name of the owner of the property
     * @param rentAmount: How much it costs to rent the property
     * @param x: x-value of the property's plot
     * @param y: y-value of the property's plot
     * @param width: Horizontal size of the property
     * @param depth: Vertical size of the property
     */
    public Property (String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
    {
        this.propertyName = propertyName;
        this.city = city;
        this.owner = owner;
        this.rentAmount = rentAmount;
        plot = new Plot(x, y, width, depth);
    }

    /**
     * Set the name of the property
     * @param propertyName: The name of the property
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * Set the city where the property is located
     * @param city: City where the property is located
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Set the owner of the property
     * @param owner: Owner of the property
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Set how much the rent costs (as a double)
     * @param rentAmount: Price of renting the property
     */
    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    /**
     * Set plot values and return plot object
     * @param x: x-value of upper left corner of the plot
     * @param y: y-value of the upper left corner of the plot
     * @param width: width (horizontal extent) of the plot
     * @param depth: depth (vertical extent) of the plot
     * @return: Plot object
     */
    public Plot setPlot(int x, int y, int width, int depth) {
        Plot plot = new Plot(x, y, width, depth);
        return plot;
    }

    /**
     * Return the name of the property
     * @return: Return the name of the property
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Return name of the city
     * @return: Return city where property is located
     */
    public String getCity() {
        return city;
    }

    /**
     * Return price of rent
     * @return: How much it costs to rent this property
     */
    public double getRentAmount() {
        return rentAmount;
    }

    /**
     * Return owner of property
     * @return: Name of owner
     */
    public String getOwner(){
        return owner;
    }

    /**
     * Returns the property's plot
     * @return plot object
     */
    public Plot getPlot() {
        return plot;
    }

    /**
     * Return information about the property
     * @return A String indicating the property's name, its city, its owner, and how much it costs to rent.
     */
    @Override
    public String toString(){
        return "Property name: " + getPropertyName()
                + "\nLocated in: " + getCity()
                + "\nBelonging to: " + getOwner()
                + "\nRent Amount: " + getRentAmount() + " ";
    }

}