//package abc;
/**
 * Exception occurs when trying to add to a full queue
 * @author Brandon Tenorio
 */
public class QueueOverflowException extends RuntimeException{
    /**
     * No-arg constructor
     */
    public QueueOverflowException(){
        this("Queue is full");
    }

    /**
     * Parameterized constructor
     * @param msg message to be sent
     */
    public QueueOverflowException(String msg){
        super(msg);
    }
}
