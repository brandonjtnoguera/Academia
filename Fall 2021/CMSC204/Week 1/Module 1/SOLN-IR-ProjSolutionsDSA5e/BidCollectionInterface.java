/**
   This is an interface for a collection of bids to install an air conditioning unit.
   @author Charles Hoot
   @author Frank M. Carrano
   @version 5.0
*/
public interface BidCollectionInterface
{
	/** Adds a bid to the end of this collection.
		 @param toAdd  The bid to add. */
	public void add(BidInterface toAdd);
	
	/** Gets the bid in this collection with the best yearly cost.
		 @param energyCost    Cost in dollars per kilowatt hour.
		 @return  A bid with the lowest yearly cost or null if the collection is empty. */
	public BidInterface bestYearlyCost(double averageHours, double energyCost);
	
	/** Gets the bid in this collection with the best initial cost. The initial
		 cost will be defined as the unit cost plus the installation cost.
		 @return  A bid with the lowest initial cost or null if the collection is empty. */
	public BidInterface bestInitialCost();    
	
	/** Removes all of the bids from this collection. */
	public void clear();    
	
	/** Gets the number of items in this collection. */
	public int getLength();
	
	/** Sees whether this collection is empty.
		 @return  True if there are no items in the bid collection, false otherwise. */
	public boolean isEmpty();
} // end BidCollectionInterface
