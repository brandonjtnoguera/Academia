package main.java;

/**
 * An interface to represent a collection of bids
 * @author Brandon Tenorio
 */
public interface BidCollectionInterface {
    /**
     * Obtains the name of the highest bidder
     * @return The name of the highest bidder
     */
    public String getHighestBidder();

    /**
     * Obtains the price of the highest bid
     * @return The price of the highest bid
     */
    public double getHighestBid();

    /**
     * Adds a bid to the collection
     */
    public void addBid(BidInterface bid);

    /**
     * Removes the last bid in the collection
     * @return The bid that was removed
     */
    public BidInterface removeBid();

    /**
     * Clears the entire collection of bids
     */
    public void clear();

    /**
     * Obtains the total amount of bids in the collection
     * @return The size of the collection (how many bids there are in it)
     */
    public int size();

    /**
     * Gets the bid from a particular bidder
     * @param bidder The name of the person whose bid we want to obtain
     * @return The bid by that particular bidder
     */
    public BidInterface getBidBy(String bidder);

    /**
     * Removes a bid made by a particular bidder
     * @param bidder The name of the person whose bid is going to be removed
     * @return The bid by bidder
     */
    public BidInterface removeBidBy(String bidder);
}
