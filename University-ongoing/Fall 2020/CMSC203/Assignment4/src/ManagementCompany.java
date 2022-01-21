/**
 * @author brandontenorio
 */
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
        //this.properties =
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
        plot = new Plot(x, y, width, depth);
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

    /**
     * Returns the management company's name
     * @return The name of the company
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the property's plot
     * @return plot object
     */
    public Plot getPlot() {
        return plot;
    }

    /** Return the constant "MAX_PROPERTY" which represent the size of the properties array
     * @return The maximum amount of properties a management company can have
     */
    public int getMAX_PROPERTY(){
        return MAX_PROPERTY;
    }

    /**
     * Adds properties to the properties array
     * @return -1 if the array is full
     * -2 is the array is null
     * -3 if the array is not contained within the Management's
     * company plot
     * -4 if the plot overlaps other properties
     * otherwise the index in the array where the property was added successfully
     */
    public int addProperty(Property property) {
        if (properties.length >= MAX_PROPERTY) {
            return -1;
        } else if (properties == null) {
            return -2;
        } else if (!plot.encompasses(property.getPlot())) {
            return -3;
        }
        for (int i = 0; i < properties.length; i++)
        {
            if (property.getPlot().overlaps(properties[i].getPlot())) { // see if it overlaps any properties in array
                return -4;
            }
        }
        // add property to array
        properties[properties.length - 1] = property;
        return properties.length - 1; // index where property was added
    }

    /**
     * Adds properties to the properties array. Creates a property object with the parameters passed to it
     * @param name Name of the property
     * @param city Name of the city where property is located
     * @param rent How much it costs to rent this property
     * @param owner Name of the property's owner
     * @return -1 if the array is full
     * -2 is the array is null
     * -3 if the array is not contained within the Management's
     * company plot
     * -4 if the plot overlaps other properties
     * otherwise the index in the array where the property was added successfully
     */
    public int addProperty(String name, String city ,double rent, String owner)
    {
        Property property = new Property(name, city, rent, owner);
        if (properties.length >= MAX_PROPERTY) {
            return -1;
        } else if (properties == null) {
            return -2;
        } else if (!plot.encompasses(property.getPlot())) {
            return -3;
        }
        for (int i = 0; i < properties.length; i++)
        {
            if (property.getPlot().overlaps(properties[i].getPlot())) { // see if it overlaps any properties in array
                return -4;
            }
        }
        // add property to array
        properties[properties.length - 1] = property;
        return properties.length - 1; // index where property was added
    }

    /**
     * Adds properties to the properties array. Creates a property object with the parameters passed to it
     * @param name Name of the property
     * @param city Name of the city where property is located
     * @param rent How much it costs to rent this property
     * @param owner Name of the property's owner
     * @return -1 if the array is full
     * -2 is the array is null
     * -3 if the array is not contained within the Management's
     * company plot
     * -4 if the plot overlaps other properties
     * otherwise the index in the array where the property was added successfully
     */
    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth)
    {
        Property property = new Property(name, city, rent, owner, x, y, width, depth);
        if (properties.length >= MAX_PROPERTY) {
            return -1;
        } else if (properties == null) {
            return -2;
        } else if (!plot.encompasses(property.getPlot())) {
            return -3;
        }
        for (int i = 0; i < properties.length; i++)
        {
            if (property.getPlot().overlaps(properties[i].getPlot())) { // see if it overlaps any properties in array
                return -4;
            }
        }
        // add property to array
        properties[properties.length - 1] = property;
        return properties.length - 1; // index where property was added
    }

    /**
     * Sums up the rent of all the properties in the "properties" array
     * @return The sum of all the rents
     */
    public double totalRent()
    {
        double total = 0;
        for (int i = 0; i < properties.length; i++)
        {
            total += properties[i].getRentAmount();
        }
        return total;
    }

    /**
     * Returns the rent amount of the property with the maximum rent
     * @return Double, maximum rent amount
     */
    public double maxRentProp()
    {
        Property maxRent = properties[0]; // Assume the property with max rent is at the 0th position in the array
        for(int i = 0; i < properties.length; i++)
        {
            if (properties[i].getRentAmount() > maxRent.getRentAmount())
            {
                maxRent = properties[i]; // If the current property's rent amount is higher than maxRent, maxRent = the current property
            }
        }
        return maxRent.getRentAmount();
    }

    /**
     * Returns the index in the array where the property with the max rent is found
     * @return Index of property with maximum rent
     */
    public int maxRentPropertyIndex()
    {
        Property maxRent = properties[0]; // Assume the property with max rent is at the 0th position in the array
        int maxRentPropertyIndex = 0; // Assume the property with max rent is at 0th position in array
        for(int i = 0; i < properties.length; i++)
        {
            if (properties[i].getRentAmount() > maxRent.getRentAmount())
            {
                maxRent = properties[i]; // If the current property's rent amount is higher than maxRent, maxRent = the current property
                i = maxRentPropertyIndex;
            }
        }
        return maxRentPropertyIndex;
    }

    /**
     * Returns the info about a property at a specific index
     * @param i Index of the property
     * @return Information about the property at index "i"
     */
    public String displayPropertyAtIndex(int i)
    {
        return properties[i].toString();
    }

    @Override
    public String toString()
    {
        String string = "";
        for (int i = 0; i < properties.length; i++)
        {
            string += "Property name: " + properties[i].getPropertyName()
                    + "\n Located in: : " + properties[i].getCity()
                    + "\n Belonging to: " + properties[i].getOwner()
                    + "\n Rent amount: " + properties[i].getRentAmount()
                    + "\n";
        }

        return "List of properties for " + name + ", taxID: " + taxID
                + "\n------------------------------------------------\n"
                + string + "Total Management Fee: " + (mgmFeePer * 100);
    }

}
