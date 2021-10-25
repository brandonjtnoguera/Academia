import java.util.*;
/**
 * Class represents a doubly linked list. It implements Iterable since it has its own ListIterator
 * @author Brandon Tenorio
 * @param <T> generic type for the class; determined by user when creating an instance
 */
public class BasicDoubleLinkedList<T> implements Iterable<T> {
    protected Node head;
    protected Node tail;
    protected int size = 0;

    /**
     * No-arg constructor, initializes head and tail to null
     */
    public BasicDoubleLinkedList(){
        head = tail = null;
    }

    /**
     * Checks if this list is empty
     * @return true if both the head and the tail are null
     */
    public boolean isEmpty(){
        return tail == null && head == null;
    }

    /**
     * Adds a node with the given data to the end of this linked list
     * @param data the data of the node to be added to the list
     * @return a reference to this instance of BasicDoubleLinkedList
     */
    public BasicDoubleLinkedList<T> addToEnd(T data){
        Node newNode = new Node(data);
        // If there's no list, make a list
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            size++;
            return this;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
        return this;
    }

    /**
     * Adds a node with the given data to the beginning of this list
     * @param data the data of the node to be added
     * @return a reference to this instance of BasicDoubleLinkedList
     */
    public BasicDoubleLinkedList<T> addToFront(T data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            size++;
            return this;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        size++;
        return this;
    }

    /**
     * Returns but does not remove the first element in this list
     * @return the data of the first element in this list
     */
    public T getFirst(){
        return head.data;
    }

    /**
     * Returns but does not remove the last element in this list
     * @return the data of the last element in this list
     */
    public T getLast(){
        return tail.data;
    }

    /**
     * Returns a ListIterator object associated with this instance of BasicDoubleLinkedList. Only implements methods:
     * next(), hasNext(), previous(), hasPrevious()
     * @return a ListIterator<T> object
     * @throws UnsupportedOperationException thrown for all the other methods that aren't the ones mentioned before
     * @throws NoSuchElementException thrown when list has no more elements to iterate through
     */
    public ListIterator<T> iterator() throws UnsupportedOperationException, NoSuchElementException {
        return new LinkedListIterator();
    }

    /**
     * Removes a specific element in this list
     * @param targetData the data of the element to be removed
     * @param comparator instance of Comparator<T> used to find the element with the targetData
     * @return a reference to this instance of BasicDoubleLinkedList
     * @throws NoSuchElementException thrown if targetData is not in this list
     */
    public BasicDoubleLinkedList<T> remove(T targetData, Comparator<T> comparator) throws NoSuchElementException{
        // If list is empty you can't remove anything from it
        if(isEmpty()) throw new NoSuchElementException("This list is empty");

        // If there is only one element in the list
        else if(thereIsOnlyOneElementInTheList() && comparator.compare(head.data, targetData) == 0){
            head = tail = null;
            size--;
            return this;
        }

        // If data is at head
        else if(comparator.compare(head.data, targetData) == 0){
            head = head.next;
            head.prev = null;
            size--;
            return this;
        }

        // If data is at tail
        else if(comparator.compare(tail.data, targetData) == 0){
            tail = tail.prev;
            tail.next = null;
            size--;
            return this;
        }

        // If data is between head and tail (not inclusive, hence why we're starting at head.next)
        else{
            Node current = head.next;
            while(current != null){
                if(comparator.compare(current.data, targetData) == 0){
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    size--;
                    return this;
                }
                current = current.next;
            }
        }
        // If data was not found
        throw new NoSuchElementException("The data you're trying to remove isn't on this list");
    }

    /**
     * Returns and removes the first element in this list
     * @return the data of the first element in this list
     * @throws NoSuchElementException thrown if there is no first element
     */
    public T retrieveFirstElement() throws NoSuchElementException{
        // If there is no head throw an exception
        if(head == null) throw new NoSuchElementException();

        T data = head.data;

        // If there is only one element in the list
        if(thereIsOnlyOneElementInTheList()){
            head = tail = null;
            return data;
        }

        // If there are at least 2 elements
        head = head.next;
        head.prev = null;
        return data;
    }

    /**
     * Returns and removes the last element in this list
     * @return the data of the last element in this list
     * @throws NoSuchElementException thrown if there is no last element
     */
    public T retrieveLastElement() throws NoSuchElementException{
        // If there is no tail return null
        if(tail == null) throw new NoSuchElementException();

        T data = tail.data;

        // If there is only one element in the list
        if(thereIsOnlyOneElementInTheList()){
            head = tail = null;
            return data;
        }

        // If there are at least 2 elements in the list
        tail = tail.prev;
        tail.next = null;
        return data;
    }

    /**
     * Creates an arrayList object filled with the data of this list's elements
     * @return an arrayList object
     */
    public ArrayList<T> toArrayList(){
        Node current = head;
        ArrayList<T> list = new ArrayList<>();
        while(current != null){
            list.add(current.data);
            current = current.next;
        }
        return list;
    }

    /**
     * Retrieves the current size of this list
     * @return the size of this list
     */
    public int getSize() {
        return size;
    }

    /**
     * Clears the list
     */
    public void clear(){
        head = tail = null;
    }

    /**
     * Checks to see if there is only one element in this list
     * @return true if there is only one element in this list
     */
    public boolean thereIsOnlyOneElementInTheList(){
        return head.prev == null && head.next == null && tail.prev == null && tail.next == null;
    }

    /**
     * Auxiliary Node class for BasicDoubleLinkedList class
     */
    public class Node{
        protected T data;
        protected Node next;
        protected Node prev;

        /**
         * Parameterized constructor. Initializes data with the param passed into it; initializes next and prev to null
         * @param data the data that an instance of node will hold
         */
        public Node(T data){
            this.data = data;
            next = prev =  null;
        }
    }

    /**
     * Auxiliary ListIterator class for BasicDoubleLinkedLIst class
     */
    public class LinkedListIterator implements ListIterator<T>{
        Node current = head;
        Node beforeCurrent;

        /**
         * Checks to see if this list contains more elements when traversing it forwards
         * @return true if and only if a call to next() would return a value rather than throw an exception
         */
        @Override
            public boolean hasNext(){
                return current != null;
        }

        /**
         * Returns the next element in the list and advances the pointer by one
         * @return the next element in the list
         * @throws NoSuchElementException if and only if the iteration has no next element
         */
        @Override
        public T next() throws NoSuchElementException{
            if(!hasNext()) throw new NoSuchElementException();
            T data;
            beforeCurrent = current;
            current = current.next;
            data = beforeCurrent.data;
            return data;
        }

        /**
         * Returns true if current iteration has more elements when traversing backwards
         * @return true if iteration has more elements when traversing backwards
         */
        @Override
        public boolean hasPrevious() {
            return beforeCurrent != null;
        }

        /**
         * Returns the previous element in the list
         * @return the previous element in the list
         * @throws NoSuchElementException if the iteration has no more elements when traversing it backwards
         */
        @Override
        public T previous() throws NoSuchElementException{
            if(!hasPrevious()) throw new NoSuchElementException();
            T data;
            current = beforeCurrent;
            beforeCurrent = beforeCurrent.prev;
            data = current.data;
            return data;
        }

        /**
         * Unsupported operation
         * @return UnsupportedOperationException
         */
        @Override
        public int nextIndex() {
            throw new UnsupportedOperationException();
        }

        /**
         * Unsupported operation
         * @return UnsupportedOperationException
         */
        @Override
        public int previousIndex() {
            throw new UnsupportedOperationException();
        }

        /**
         * Unsupported operation
         */
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /**
         * Unsupported operation
         */
        @Override
        public void set(T t) {
            throw new UnsupportedOperationException();
        }

        /**
         * Unsupported operation
         */
        @Override
        public void add(T t) {
            throw new UnsupportedOperationException();
        }
    }
}
