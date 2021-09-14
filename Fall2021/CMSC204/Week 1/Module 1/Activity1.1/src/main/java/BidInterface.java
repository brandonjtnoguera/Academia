package main.java;

/**
 * An interface for representing a single bid on an air conditioner unit
 * @author Brandon Tenorio
 */

public interface BidInterface {
    /**
     * Obtains the information about any particular A.C. Unit
     * @returns A string with information about an A.C. Unit
     */
    public String getACUnitInfo();

    /**
     * Gets the name of the highest bidder
     * @returns The name of the highest bidder
     */
    public String getBidder();

    /**
     * Gets the price of the unit
     * @return The price of the A.C. Unit
     */
    public double getUnitCost();

    /**
     * Gets the price of installing an A.C. Unit
     * @return The price of installing an air conditioner unit
     */
    public double getInstallationCost();
}
