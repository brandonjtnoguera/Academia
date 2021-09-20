//package abc;
/**
 * Exception occurs when trying to push into a full stack
 * @author Brandon Tenorio
 */
public class StackOverflowException extends RuntimeException{
    /**
     * No-arg constructor
     */
    public StackOverflowException(){
        this("Stack is full");
    }

    /**
     * Parameterized constructor
     * @param msg message to be sent
     */
    public StackOverflowException(String msg){
        super(msg);
    }
}
