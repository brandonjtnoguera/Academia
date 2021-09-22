//package abc;
/**
 * Exception occurs when trying to pop a stack that is empty
 * @author Brandon Tenorio
 */
public class StackUnderflowException extends RuntimeException{
    /**
     * No-arg constructor
     */
    public StackUnderflowException(){
        this("Stack is empty");
    }

    /**
     * Parameterized constructor
     * @param msg message to be sent
     */
    public StackUnderflowException(String msg){
        super(msg);
    }
}
