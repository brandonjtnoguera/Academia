package main.java;
/**
 * Thrown if password is valid but contains 6 to 9 characters
 * @author Brandon Tenorio
 */
public class WeakPasswordException extends RuntimeException{
    /**
     * No-arg constructor
     */
    public WeakPasswordException(){
        this("The password is OK but weak - it contains fewer than 10 characters.");
    }
    /**
     * Parameterized constructor
     * @param message Message to be shown if exception is thrown
     */
    public WeakPasswordException(String message){
        super(message);
    }
}
