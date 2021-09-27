import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


/**
 * A utility class that manipulates a two dimensional ragged array of doubles with a maximum of 10 rows and 10 columns.
 * It works with both negative and positive numbers.
 * @author Brandon Tenorio
 */
public class TwoDimRaggedArrayUtility
{

    /**
     * Sums up all of the values in the array, divides them by the total amount of elements, and returns the result
     * @param data A two-dimensional ragged array of doubles
     * @return The total sum of all values in the array divided by the total elements in the array
     */
    public static double getAverage(double[][] data){

        double sum = 0;
        int elements = 0;

        // i = rows
        // j = columns
        // Iterate through the rows (i)
        for (int i = 0; i < data.length; i++){
            // If you count the elements in every row, you'll get the total amount of elements. So you just need to add the elements at every row
            elements += data[i].length;
            // Iterate through the column (j) at the current row (data[i].length)
            for (int j = 0; j < data[i].length; j++){
                // Add current value in array to sum
                sum += data[i][j];
            }
        }
        return sum/elements;
    }

    /**
     * Returns the sum of all the values in a specific column
     * @param data 2 Dimensional ragged array of doubles
     * @param col The columns in the array that we want to add up
     * @return The sum of all values in col
     */
    public static double getColumnTotal(double[][] data, int col){

        double total = 0;

        for(int row = 0; row < data.length; row++){
            if(data[row].length > col){
                //Only add the values in the column we passed through the method
                total += data[row][col];
            }
        }
        return total;
    }

    /**
     * Finds and returns the highest elements in the 2-dim array data
     * @param data A 2 dimensional array
     * @return Highest element in the 2 dimensional array
     */
    public static double getHighestInArray(double[][] data){

        // Assume highest element is in the first row, first column of the array
        double highestElement = data[0][0];

        // Iterate through the whole array
        for(int row = 0; row < data.length; row++){
            for(int col = 0; col < data[row].length; col++){
                // If current element in the array is greater than highestElement, highestElement is set to current element
                if(data[row][col] > highestElement){
                    highestElement = data[row][col];
                }
            }
        }
        return highestElement;
    }

    /**
     * Finds the highest element in the specified column of the 2 dimensional array
     * @param data A 2 dimensional array
     * @param col Specified column where highest element will be found
     * @return Highest element in the specified column of the array
     */
    public static double getHighestInColumn(double[][] data, int col){

        // Assume highest element in column is in the first row, first column
        double highestInColumn = data[0][col];

        for(int row = 0; row < data.length; row++){

            if(data[row].length > col && data[row][col] > highestInColumn){
                highestInColumn = data[row][col];
            }
        }

        return highestInColumn;
    }

    /**
     * Finds and returns the index of the highest element in the specified column of a 2 dimensional array
     * @param data 2 dimensional array
     * @param col Column in which to find the highest element
     * @return Row index of the highest element in the array
     */
    public static int getHighestInColumnIndex(double[][] data, int col){

        // Assume the index is at row 0 of whatever col is
        int highestInColumnIndex = 0;

        for(int row = 0; row < data.length; row++){
            // Validate that a value exists in the column of the current array. If the value at the current position
            // is less than the value at the position assumed above, the lowest index is at the current position
            if(data[row].length > col && data[row][col] > data[highestInColumnIndex][col]){
                highestInColumnIndex = row;
            }
        }
        return highestInColumnIndex;
    }

    /**
     * Finds and returns the highest element in the specified row of the 2 dimensional array
     * @param data A 2 dimensional array
     * @param row The index of the row in which to find the highest element
     * @return The highest element in the specified row of the 2 dimensional array
     */
    public static double getHighestInRow(double[][] data, int row){

        // Assume highest element in array is at row 0, col 0
        double highestInRow = data[row][0];

        for(int col = 0; col < data[row].length; col++){
            // If current element in the array is greater than the assumed element above, set highestInRow to current element in array
            if(data[row][col] > highestInRow){
                highestInRow = data[row][col];
            }
        }
        return highestInRow;
    }

    /**
     * Finds highest element in the row of a 2 dimensional array, and returns its column index
     * @param data A 2 dimensional array
     * @param row The index of the row in which to find the highest element
     * @return Index of the column of the highest element in the specified row
     */
    public static int getHighestInRowIndex(double[][] data, int row){

        // Find the index of the column where the highest element is, we already know which row it's at
        // Assume the highest element is at column 0  of whatever row is
        int highestInRowIndex = 0;

        for(int col = 0 ; col < data[row].length; col++){
            // If current element in the array is greater than the assumed element at position data[row][0], set highestInRowIndex to current index
            if(data[row][col] > data[row][highestInRowIndex]){
                highestInRowIndex = col;
            }
        }
        return highestInRowIndex;
    }

    /**
     * Finds and returns lowest element in the array
     * @param data A 2 dimensional array
     * @return Lowest element in the array
     */
    public static double getLowestInArray(double[][] data){
        // Assume lowest element is in row 0, col 0
        double lowestInArray = data[0][0];

        for(int row = 0; row < data.length; row++){
            for(int col = 0; col < data[row].length; col++){
                // If current element in array is lower than the assumed lowest above, set lowestInArray to current element
                if(data[row][col] < lowestInArray){
                    lowestInArray = data[row][col];
                }
            }
        }
        return lowestInArray;
    }

    /**
     * Finds and returns lowest element in the specified column of a 2 dimensional array
     * @param data A 2 dimensional array
     * @param col Column in which to find the lowest element
     * @return Lowest element in the specified column of the 2 dimensional array
     */
    public static double getLowestInColumn(double[][] data, int col){

        // Assume lowest element is at the first row of whatever column is
        double lowestInColumn = data[0][col];

        for(int row = 0; row < data.length; row++){
            /*
            The length of the array we're currently looking at has to be greater than the col passed into this method to
            ensure that a value exists in the specified column of the current array.
             */
            if(data[row].length > col && data[row][col] < lowestInColumn){
                lowestInColumn = data[row][col];
            }
        }
        return lowestInColumn;
    }

    /**
     * Finds and returns the index of the lowest element in 2 dimensional array
     * @param data 2 dimensional array
     * @param col Row in which to find the lowest element
     * @return Row index of the lowest element in the array
     */
    public static int getLowestInColumnIndex(double[][] data, int col){

        // Assume the index is at row 0 of whatever col is
        int lowestInColumnIndex = 0;

        for(int row = 0; row < data.length; row++){
            // Validate that a value exists in the column of the current array. If the value at the current position
            // is less than the value at the position assumed above, the lowest index is at the current position
            if(data[row].length > col && data[row][col] < data[lowestInColumnIndex][col]){
                lowestInColumnIndex = row;
            }
        }
        return lowestInColumnIndex;
    }

    /**
     * Finds and returns the lowest element in the specified row of the 2 dimensional array
     * @param data A 2 dimensional array
     * @param row The index of the row in which to find the highest element
     * @return The lowest element in the specified row of the 2 dimensional array
     */
    public static double getLowestInRow(double[][] data, int row){

        // Assume highest element in array is at col 0 of whatever row we're looking at
        double lowestInRow = data[row][0];

        for(int col = 0; col < data[row].length; col++){
            // If current element in the array is greater than the assumed element above, set highestInRow to current element in array
            if(data[row][col] < lowestInRow){
                lowestInRow = data[row][col];
            }
        }
        return lowestInRow;
    }

    /**
     * Finds lowest element in the row of a 2 dimensional array, and returns its column index
     * @param data A 2 dimensional array
     * @param row The index of the row in which to find the lowest element
     * @return Index of the column of the lowest element in the specified row
     */
    public static int getLowestInRowIndex(double[][] data, int row){

        // Find the index of the column where the lowest element is, we already know which row it's at
        // Assume the lowest element is at column 0  of whatever row is
        int lowestInRowIndex = 0;

        for(int col = 0 ; col < data[row].length; col++){
            // If current element in the array is less than the assumed element at position data[row][0], set lowestInRowIndex to current index
            if(data[row][col] < data[row][lowestInRowIndex]){
                lowestInRowIndex = col;
            }
        }
        return lowestInRowIndex;
    }

    /**
     * Add up all elements in a specific row of the 2 dimensional array
     * @param data A 2 dimensional array
     * @param row The row to find all the elements to add up
     * @return The sum off all elements in specified row
     */
    public static double getRowTotal(double[][] data, int row){

        double total = 0;

        for(int col = 0; col < data[row].length; col++){
            total += data[row][col];
        }
        return total;
    }

    /**
     * Sums up all elements in the array
     * @param data 2 dimensional array
     * @return The sum of all elements in the array
     */
    public static double getTotal(double[][] data){

        double total = 0;

        for(int row = 0; row < data.length; row++){
            for(int col = 0; col < data[row].length; col++){
                total += data[row][col];
            }
        }
        return total;
    }


    /**
     * Reads and saves a 2d array from a file
     * @param file The file from which to read
     * @return A 2d array
     */
    public static double[][] readFile(File file){
        double[][] data = null;
        try
        {
            Scanner s = new Scanner(file);
            int row = 0;
            while(s.hasNextLine())
            {
                ++row;
                s.nextLine();
            }

            s.close();
            s = new Scanner(file);
            String line;
            data = new double[row][];
            for(int i = 0; i < data.length; ++i)
            {
                line = s.nextLine();
                String[] nums = line.split(" ");
                data[i] = new double[nums.length];
                for(int j = 0; j < data[i].length; ++j)
                {
                    data[i][j] = Double.parseDouble(nums[j]);
                }
            }
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    /**
     * Writes 2D array onto a .txt file
     * @param data
     * @param file
     */
    public static void writeToFile(double[][] data, File file) {
        try {
            PrintWriter writer = new PrintWriter(file);
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    writer.print(data[i][j] + " ");
                }
                writer.println();
            }
            writer.close();
        } catch (Exception e) {
            System.out.print(Arrays.toString(e.getStackTrace()));

        }
    }
}
