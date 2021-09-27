import java.util.Scanner;

public class RandomNumberGuesser {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String anotherRound;
        String[] numbers = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh"};

        do {
            int maxAttempts = 7, lowGuess = 0, highGuess = 99, nextGuess = 0;
            boolean inputValidation;
            int randNum = RNG.rand();
            RNG.resetCount();
            for (int i = 0; i < 7; i++) {
                System.out.println("Enter your " + numbers[i] + " guess");
                nextGuess = keyboard.nextInt();
                inputValidation = RNG.inputValidation(nextGuess, lowGuess, highGuess);

                while (!inputValidation) {
                    System.out.println("Enter your " + numbers[i] + " guess again");
                    nextGuess = keyboard.nextInt();
                    inputValidation = RNG.inputValidation(nextGuess, lowGuess, highGuess);
                    maxAttempts++;
                }
                if (nextGuess > randNum) {
                    System.out.println("Your guess is too high. Keep trying! :)");
                    highGuess = nextGuess;
                } else if (nextGuess < randNum) {
                    System.out.println("Your guess is too low. Keep trying! :)");
                    lowGuess = nextGuess;
                } else if (nextGuess == randNum) {
                    System.out.println("Congrats! You guessed correctly");
                    break;
                }
                System.out.println("Your next guess is between " + lowGuess + " and " + highGuess);
                System.out.println("You have " + (maxAttempts - RNG.getCount()) + " attempts left.\n");
            }
            if (nextGuess != randNum){
                System.out.println("Good try yo! :D better luck next time. The number was " + randNum);
            }
            System.out.println("Try again? (yes or no)");
            anotherRound = keyboard.nextLine();
            anotherRound = keyboard.nextLine();
            System.out.println();
        } while (anotherRound.compareToIgnoreCase("yes") == 0);
    }
}