package main.java;
/**
 * Thrown if a password does not contain an upper alphabetic character
 * @author: Brandon Tenorio
 */
public class NoUpperAlphaException extends RuntimeException{
    /**
     * No-arg constructor
     */
    public NoUpperAlphaException(){
        this("The password must contain at least one uppercase alphabetic character.");
    }
    /**
     * Parameterized constructor
     * @param message: The error message to be shown if exception is thrown
     */
    public NoUpperAlphaException(String message){
        super(message);
    }
}