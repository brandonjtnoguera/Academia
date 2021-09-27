import java.util.ArrayList;

/**
 * A linked list implementation of a queue
 * @author Brandon Tenorio
 */
public class NotationQueue<T> implements QueueInterface<T>{
    private class Node{
        private T data;
        private Node next;

        public Node(T data, Node next){
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node first, last;
    private final int capacity;
    private int size;

    /**
     * Parameterized constructor
     * @param capacity max capacity of this queue
     */
    public NotationQueue(int capacity){
        this.capacity = capacity;
        first = null;
        last = null;
    }

    /**
     * Checks to see if queue is empty
     * @return true if empty
     */
    public boolean isEmpty() {
        return first == null || last == null;
    }

    /**
     * Checks to see if queue is full
     * @return true if full
     */
    public boolean isFull() {
        return size == capacity;
    }

    /**
     * Retrieves the data of entry at the front of the queue without getting rid of it
     * @return data of the entry at the front of the queue
     * @throws QueueUnderflowException if queue is empty
     */
    public T peek() throws QueueUnderflowException{
        if(isEmpty()) throw new QueueUnderflowException();
        return first.getData();
    }

    /**
     * Removes entry at front of the queue
     * @return the entry at the front of the queue
     * @throws QueueUnderflowException if queue is empty
     */
    public T dequeue() throws QueueUnderflowException {
        if(isEmpty()) throw new QueueUnderflowException();
        T data = peek();
        first = first.getNext();
        size--;
        return data;
    }

    /**
     * Retrieves the total number of entries in this queue
     * @return number of entries in this queue
     */
    public int size() {
        return size;
    }

    /**
     * Adds an entry to the back of the queue
     * @param data an entry to be added
     * @return true if operation was successful
     * @throws QueueOverflowException if queue is full
     */
    public boolean enqueue(T data) throws QueueOverflowException {
        Node newNode = new Node(data, null);
        if(isFull()) throw new QueueOverflowException();
        if(isEmpty())
            first = newNode;
        else last.setNext(newNode);
        last = newNode;
        size++;
        return true;
    }

    /**
     *  Returns the string representation of the elements in the Queue,
     * 	the beginning of the string is the front of the queue
     * 	@return string representation of the Queue with elements
     */
    @Override
    public String toString(){
        StringBuilder stringQueue = new StringBuilder();

        Node head = first;
        int i = 0;
        while(i < size()){
            stringQueue.append(peek());
            first = first.getNext();
            i++;
        }
        first = head;

        return stringQueue.toString();
    }

    /**
     * Returns the string representation of the elements in the Queue, the beginning of the string is the front of the queue
     * Place the delimiter between all elements of the Queue
     * @return string representation of the Queue with elements separated with the delimiter
     */
    public String toString(String delimiter) {
        String delimiterStringQueue = "";

        Node head = first;
        int i = 0;
        while(i < size()){
            delimiterStringQueue += peek() + delimiter;
            first = first.getNext();
            i++;
        }
        first = head;

        return delimiterStringQueue.substring(0, delimiterStringQueue.length() - 1);
    }

    /**
     * Clones an ArrayList object
     * @param list arrayList object to be cloned
     * @return copy of arrayList object
     */
    private ArrayList<T> clone(ArrayList<T> list){
        ArrayList<T> clone = new ArrayList<>(list.size());
        clone.addAll(list);
        return clone;
    }

    /**
     * Fills the Queue with the elements of the ArrayList, First element in the ArrayList
     * is the first element in the Queue
     * YOU MUST MAKE A COPY OF LIST AND ADD THOSE ELEMENTS TO THE QUEUE, if you use the
     * list reference within your Queue, you will be allowing direct access to the data of
     * your Queue causing a possible security breech.
     * @param list elements to be added to the Queue
     */
    public void fill(ArrayList<T> list) {
        ArrayList<T> clone = clone(list);
        for(T element : clone){
            enqueue(element);
        }
    }
}
