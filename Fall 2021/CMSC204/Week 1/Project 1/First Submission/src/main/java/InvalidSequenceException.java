package main.java;
/**
 * Thrown if password contains more than 2 of the same character in a sequence
 * @author Brandon Tenorio
 */
public class InvalidSequenceException extends RuntimeException{
    /**
     * No-arg constructor
     */
    public InvalidSequenceException(){
        this("The password cannot contain more than two of the same character in sequence");
    }
    /**
     * Parameterized constructor
     * @param message Message to be shown if exception is thrown
     */
    public InvalidSequenceException(String message){
        super(message);
    }
}
