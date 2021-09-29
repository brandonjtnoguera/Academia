//package abc;
/**
 * Exception occurs when notation format is invalid
 * @author Brandon Tenorio
 */
public class InvalidNotationFormatException extends RuntimeException{
    /**
     * No-arg constructor
     */
    public InvalidNotationFormatException(){
        this("Notation format is incorrect");
    }

    /**
     * Parameterized constructor
     * @param msg message to be displayed
     */
    public InvalidNotationFormatException(String msg){
        super(msg);
    }
}
