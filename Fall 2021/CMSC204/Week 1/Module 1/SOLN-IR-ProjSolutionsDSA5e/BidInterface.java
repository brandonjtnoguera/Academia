/**
   This is an interface for a single bid for installing
   an air conditioning unit.
   
   @author Charles Hoot
   @author Frank M. Carrano
   @version 5.0
*/
public interface BidInterface
{
	/** Gets the name of the company making this bid.
		 @return  The name of the company making the bid. */
	public String getCompanyName(); 
    
	/** Gets a description of the air conditioner proposed in this bid.
		@return  The description of the air conditioner. */
	public String getDescription();
	
	/** Gets the capacity in tons (1 ton = 12,000 BTU) of
       the air conditioner proposed in this bid.
		 @return  The cooling capacity of the AC unit in tons. */
	public double getCapacity();  
	
	/** Gets the seasonal efficiency (SEER) of the air conditioner proposed in this bid.
		 @return  The seasonal efficiency of the proposed AC unit. */
	public double getSEER();
	
	/** Gets the cost of this bid's AC.
		 @return  The cost of the AC unit in dollars. */
	public double getUnitCost(); 
	
	/** Gets the cost of installing the air conditioner proposed in this bid.
		 @return  The cost of installation in dollars. */
	public double getInstallationCost();
	
	/** Gets the yearly cost of operating the air conditioner proposed in this bid.
		@param hoursOperated  Average number of hours the unit operates per year.
		@param energyCost     Cost in dollars per kilowatt hour.
		@return  The cost for the year in dollars,
				   cost = 12 * tons * energyCost * hoursOperated / SEER. */
	public double getYearlyCost(double hoursOperated, double energyCost);
} // end BidInterface
