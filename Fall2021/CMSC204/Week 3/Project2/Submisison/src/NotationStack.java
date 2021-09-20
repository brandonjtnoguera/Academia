//package abc;
import java.util.ArrayList;
/**
 * Linked list implementation of a stack
 * @param <T> a generic type
 * @author Brandon Tenorio
 */
public class NotationStack<T> implements StackInterface<T>{
     
    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return false;
    }

    public T pop() throws StackUnderflowException {
        return null;
    }

    public T top() throws StackUnderflowException {
        return null;
    }

    public int size() {
        return 0;
    }

    public boolean push(T e) throws StackOverflowException {
        return false;
    }

    public String toString(String delimiter) {
        return null;
    }

    public void fill(ArrayList<T> list) {

    }
}
