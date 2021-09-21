import java.util.ArrayList;

/**
 * A linked list implementation of a queue
 * @author Brandon Tenorio
 */
public class NotationQueue<T> implements QueueInterface<T>{
    private static class QueueNode<T>{
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data){
            this.data = data;
        }
    }

    private QueueNode<T> first, last;
    private int initialSize, currentSize;
    
    public NotationQueue(int initialSize){
        this.initialSize = initialSize;
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
