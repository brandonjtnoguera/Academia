package main.java;
/**
 * Thrown if password and password confirmation do not match
 * @author Brandon Tenorio
 */
public class UnmatchedException extends RuntimeException{
    /**
     * No-arg constructor
     */
    public UnmatchedException() {
        this("The passwords do not match");
    }

    /**
     * Parameterized constructor
     * @param message Message to be shown if exception is thrown
     */
    public UnmatchedException(String message){
        super(message);
    }
}
