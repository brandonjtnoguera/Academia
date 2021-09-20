import java.util.ArrayList;

/**
 * A linked list implementation of a queue
 * @author Brandon Tenorio
 */
public class NotationQueue<T> implements QueueInterface<T>{
    private Node<T> first, last;

    private static class Node<T>{
        @SuppressWarnings("FieldMayBeFinal")    // It's not final, you can change it at anytime, the warning is just annoying
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }
    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return false;
    }

    public T dequeue() throws QueueUnderflowException {
        return null;
    }

    public int size() {
        return 0;
    }

    public boolean enqueue(T e) throws QueueOverflowException {
        return false;
    }

    public String toString(String delimiter) {
        return null;
    }

    public void fill(ArrayList<T> list) {

    }
}
