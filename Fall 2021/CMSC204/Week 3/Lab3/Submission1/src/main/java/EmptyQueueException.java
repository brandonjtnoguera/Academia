/**
 * Class to represent the exception message when a queue is empty
 * @author Brandon Tenorio
 */
public class EmptyQueueException extends RuntimeException{

    /**
     * Default constructor. Prints out the message "The queue is empty"
     */
    public EmptyQueueException(){
        super("The queue is empty");
    }

    /**
     * Parameterized constructor. Prints out the given message
     * @param msg A message to be printed out when exception is caught
     */
    public EmptyQueueException(String msg){
        super(msg);
    }
}
