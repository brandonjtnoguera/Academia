/**
 * Class that calculates the total holiday bonus
 * @author Brandon Tenorio
 */
public class HolidayBonus
{
    /**
     * Calculates the bonus for all stores(rows) depending on how well they did on sales
     * @param data A 2d ragged array of doubles
     * @param highBonus bonus amount for store with the highest sales in a category(col)
     * @param lowBonus bonus amount for store with the lowest sales in a category(col)
     * @param regularBonus bonus amount for all the other stores that don't have the highest or lowest sales
     * @return Array of doubles containing the total bonus for each store
     */
    public static double[] calculateHolidayBonus(double[][] data, double highBonus, double lowBonus, double regularBonus){

        double []bonus = new double[6];
        int highestInColIndex;
        int lowestInColIndex;

        for(int col = 0; col < 6; col++){
            highestInColIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col);
            bonus[highestInColIndex] += highBonus;
            lowestInColIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col);
            bonus[lowestInColIndex] += lowBonus;

            for(int row = 0; row < bonus.length; row++){
                if(row == highestInColIndex || row == lowestInColIndex){
                    break;
                }
                bonus[row] += regularBonus;
            }
        }

        return bonus;
    }


    /**
     * Calculates the total holiday bonus for all stores
     * @param data 2d ragged array of doubles
     * @param high bonus for store with highest sales
     * @param low bonus for store with lowest sales
     * @param other bonus for all other stores
     * @return the total sum of all holiday bonuses
     */
    public static double calculateTotalHolidayBonus(double [][]data, double high, double low, double other){

        double []bonus = calculateHolidayBonus(data, high, low, other);
        int totalHolidayBonus = 0;

        for(int i = 0; i < bonus.length; i++){
            totalHolidayBonus += bonus[i];
        }

        return totalHolidayBonus;
    }
}
