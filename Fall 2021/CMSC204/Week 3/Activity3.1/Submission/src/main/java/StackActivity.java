import java.util.Iterator;
import java.util.Stack;

public class StackActivity {

    public static void main(String[] args) {
        Stack<String> bString = new Stack<>();

        bString.push("1");
        bString.push("1");
        bString.push("1");
        bString.push("1");
        bString.push("0");
        bString.push("1");
        bString.push("0");
        bString.push("1");
        bString.push("0");

        if(hasSameAmountOfZerosAndOnes(bString)) System.out.println("works");

        System.out.println(getPercentageOfZeroesInStack(bString) + "%"); // should be 50

    }
    /*
    Go through the stack. Increment a "ones counter" every time you see a one in the string; increment a "zeros counter"
    every time you see a zero in the String. Return ones counter == zeroes counter
     */
    public static boolean hasSameAmountOfZerosAndOnes(Stack<String> binaryString){
        int zerosCounter = 0;
        int onesCounter = 0;
        for (String s : binaryString) {
            if (s.equals("0")) zerosCounter++;
            else onesCounter++;
        }
        return zerosCounter == onesCounter;
    }

    /*
    Get the total number of the string. count all the 0s in the string. total zeroes divided by string length = % of zeroes in the string; the remaining
    percentage is the % of ones in the string
     */
    public static double getPercentageOfZeroesInStack (Stack<String> binaryString){
        double zeroesCounter = 0;
        double stackSize = binaryString.size();

        for (String binaryNumber : binaryString){
            if (binaryNumber.equals("0")) zeroesCounter++;
        }
        return zeroesCounter/stackSize * 100;
    }
}
