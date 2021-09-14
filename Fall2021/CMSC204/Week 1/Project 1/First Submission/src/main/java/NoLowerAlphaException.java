package main.java;
/**
 * Thrown if password does not contain a lower case alphabetic character
 * @author Brandon Tenorio
 */
public class NoLowerAlphaException extends RuntimeException{
    /**
     * No-arg constructor
     */
    public NoLowerAlphaException(){
        this("The password must contain at least one lowercase alphabetic character.");
    }
    /**
     * Parameterized constructor
     * @param message Message to be shown if exception is thrown
     */
    public NoLowerAlphaException(String message){
        super(message);
    }
}