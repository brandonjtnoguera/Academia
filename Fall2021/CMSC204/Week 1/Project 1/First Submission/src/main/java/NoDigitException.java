package main.java;
/**
 * Thrown if password does not contain a digit
 * @author Brandon Tenorio
 */
public class NoDigitException extends RuntimeException{
    /**
     * No-arg constructor
     */
    public NoDigitException(){
        this("The password must contain at least one digit.");
    }
    /**
     * Parameterized constructor
     * @param message Message to be shown if exception is thrown
     */
    public NoDigitException(String message){
        super(message);
    }
}