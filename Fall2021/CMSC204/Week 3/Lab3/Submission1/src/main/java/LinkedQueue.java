/**
 * A Class to represent a Linked Node implementation of a queue\
 * @author Brandon Tenorio
 */
public final class LinkedQueue<T> implements QueueInterface<T> {
    /**
     * An inner class to represent a node
     */
    private static class Node<T>{
        @SuppressWarnings("FieldMayBeFinal")    // It's not final, you can change it at anytime, the warning is just annoying
        private T data;
        private Node<T> next;

        /**
         * Parameterized constructor initializes data and nextNode
         * @param data the data that a node holds
         */
        public Node(T data){
            this.data = data;
        }
    }
    
    private Node<T> first, last;

    /**
     * Adds a node to the back of the queue
     * @param entry  A node to be added.
     */
    public void enqueue(T entry) {
        Node<T> newNode = new Node<>(entry);
        if (last != null) last.next = newNode;
        last = newNode;
        if (first == null) first = last;
    }

    /**
     * Removes a node from the front of the queue
     * @return The node that was just removed at the front of the queue
     * @throws EmptyQueueException if the queue is empty, then there is no first node, thus way to remove the first node, so throw an exception
     */
    public T dequeue() throws EmptyQueueException{
        if (first == null) throw new EmptyQueueException();
        T data = first.data;
        first = first.next;
        if (first == null) last = null;
        return data;
    }

    /**
     * Retrieves the data of the node at the front of the queue
     * @return the data from the node at the front of the queue
     * @throws EmptyQueueException if queue is empty there is no front, so it would throw an exception
     */
    public T getFront() throws EmptyQueueException{
        if (first == null) throw new EmptyQueueException();
        return first.data;
    }

    /**
     * Checks to see if this queue is empty
     * @return true if first and last are null, aka if the queue is empty
     */
    public boolean isEmpty() {
        return (first == null) && (last == null);
    }

    /**
     * Clears the whole queue
     */
    public void clear() {
        first = null;
        last = null;
    }
}
