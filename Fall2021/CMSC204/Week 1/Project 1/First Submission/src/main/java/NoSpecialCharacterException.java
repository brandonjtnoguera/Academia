package main.java;
/**
 * Thrown if password does not contain one special character
 * @author Brandon Tenorio
 */
public class NoSpecialCharacterException extends RuntimeException{
    /**
     * No-argconstructor
     */
    public NoSpecialCharacterException(){
        this("The password must contain at least one special character.");
    }
    /**
     * Parameterized constructor
     * @param message Message to be shown ifv exception is thrown
     */
    public NoSpecialCharacterException(String message){
        super(message);
    }
}