//package abc;
/**
 * Exception occurs when trying to remove an entry from an empty queue
 * @author Brandon Tenorio
 */
public class QueueUnderflowException extends RuntimeException{
    /**
     * No-arg constructor
     */
    public QueueUnderflowException(){
        this("Queue is empty");
    }

    /**
     * Parameterized constructor
     * @param msg message to be sent
     */
    public QueueUnderflowException(String msg){
        super(msg);
    }
}
