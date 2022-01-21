import java.util.*;
/**
 * @author Brandon Tenorio
 */
public class SolitaireGame {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> cardNumbers = new ArrayList<>();
        ListIterator<Integer> listIterator = cardNumbers.listIterator();

        for(int i = 0; i < 20; i++){
            // Min = 10 + 1,
            // Max = 99
            listIterator.add(random.nextInt(99 - 11) + 10);
        }

        System.out.println(cardNumbers);

        ListIterator<Integer> iterator = cardNumbers.listIterator();

        while(iterator.hasNext()){
            int firstDigit = iterator.next();    // Very first digit in the list i.e: 38
            int firstDigitAtTensPlace = firstDigit / 10;    // If digit is 38, this returns 3
            int firstDigitAtOnesPlace = firstDigit - (firstDigitAtTensPlace * 10);  // If the first element is 38, this returns 8

            if(!iterator.hasNext()) break; // If there isn't a next value in the list, break out of the loop. I don't know what this does though, does it make the program go back to the very beginning (the while condition?) or does it continue?
            int secondDigit = iterator.next();  // Very first digit in the list i.e: 76
            int secondDigitAtTensPlace = secondDigit /10;   // If digit is 76, this returns 7
            int secondDigitAtOnesPlace = secondDigit - (secondDigitAtTensPlace * 10);   // If the first element is 7, this returns 6

            if(firstDigitAtTensPlace == secondDigitAtTensPlace || firstDigitAtOnesPlace == secondDigitAtOnesPlace){
                // Remove the past 2 elements in the list since they have matching pairs
                iterator.remove();
                iterator.previous();
                iterator.remove();

                if(!iterator.hasPrevious()) break;  // If there isn't a previous element in the list, break out of the loop


                iterator.previous();    // I don't remember why I wrote this line. I did it while sleep-deprived, but without it the code runs into logical errors so I must keep it
                iterator = cardNumbers.listIterator();  // Start from the beginning of the list after every removal
            }
            else iterator.previous();
        }

        System.out.println(cardNumbers);

        if(cardNumbers.size() > 0) System.out.println("You lose LMAO xD");
        else System.out.println("Nice! you win!!! POG");
    }
}
