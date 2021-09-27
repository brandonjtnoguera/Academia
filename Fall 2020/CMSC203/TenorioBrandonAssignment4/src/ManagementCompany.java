import java.beans.PropertyEditor;

public class ManagementCompany
{
    private final int MAX_PROPERTY = 5;
    private final int MGMT_WIDTH = 10;
    private final int MGMT_DEPTH = 10;
    private double mgmFeePer;
    private String name;
    private Property properties[] = new Property[MAX_PROPERTY];
    private String taxID;
    private Plot plot;

    /**
     * No-arg constructor. Initializes every String to an empty String, mgmFeePer to 0, plot to a default plot, and
     * properties
     */
    public ManagementCompany()
    {
        this.mgmFeePer = 0;
        this.name = "";
        this.taxID = "";
        this.plot = new Plot();
        this.properties =
    }

    /**
     * Parameterized constructor with no info about plot. Initializes name, taxID, and mgmFee.
     * @param name Name of the management company
     * @param taxID TaxID of the management company
     * @param mgmFee Management fee percentage
     */
    public ManagementCompany(String name, String taxID, double mgmFee)
    {
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFee;
    }

    /**
     * Parameterized constructor with information about the plot. Initializes name, taxID, mgmFee, the plot's x coordinate,
     * the plot's y coordinate, the plot's width, the plot's depth.
     * @param name Name of management company
     * @param taxID Tax ID of the management company
     * @param mgmFee Management fee percentage
     * @param x x value of the upper corner of the plot
     * @param y y value of the upper corner of the plot
     * @param depth The horizontal extent of the plot
     * @param width The vertical extent of the plot
     */
    public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int depth, int width)
    {
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFee;
        plot.setX(x);
        plot.setY(y);
        plot.setDepth(depth);
        plot.setWidth(width);
    }

    /**
     * Copy constructor
     * @param otherCompany The company that will copy everything from the current company
     */
    public ManagementCompany(ManagementCompany otherCompany)
    {
        this.mgmFeePer = otherCompany.mgmFeePer;
        this.name = otherCompany.name;
        this.taxID = otherCompany.taxID;
        this.plot = new Plot(otherCompany.plot);
        this.properties = otherCompany.properties;
    }

    /** Return the constant "MAX_PROPERTY" which represent the size of the properties array
     * @return The maximum amount of properties a management company can have
     */
    public int getMAX_PROPERTY(){
        return MAX_PROPERTY;
    }

    /**
     * Returns the property's plot
     * @return plot object
     */
    public Plot getPlot() {
        return plot;
    }
    // Finish this method
    /**
     * Adds properties to the properties array
     * @return -1 if the array is full
     * -2 is the array is null
     * -3 if the array is not contained within the Management's
     * company plot
     * -4 if the plot overlaps other properties
     * otherwise the index in the array where the property was added successfully
     */
    public int addProperty(Property property){
        if (properties.length >= MAX_PROPERTY){
            return -1;
        }
        else if(properties == null){
            return -2;
        }
        else{
            return
        }
    }
}
