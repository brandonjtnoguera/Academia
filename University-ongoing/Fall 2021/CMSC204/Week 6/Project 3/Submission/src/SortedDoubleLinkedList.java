import java.util.*;

/**
 * Class represents a sorted doubly linked list.It extends BasicDoubleLinkedList. Methods addToEnd and addToFront are not supported by this class
 * @author Brandon Tenorio
 * @param <T> generic type for the class; determined by user when creating an instance of the class
 */

public class SortedDoubleLinkedList<T> extends BasicDoubleLinkedList<T>{
    private Comparator<T> comparator;

    /**
     * Parameterized constructor, calls super(), initializes this class's instance of Comparator
     * @param comparator2
     */
    public SortedDoubleLinkedList(Comparator<T> comparator2){
        super();
        this.comparator = comparator2;
    }

    /**
     * Adds a node with the given data to its proper position in this list
     * @param data the data of the noe to be added
     * @return a reference to this instance of the class
     */
    public SortedDoubleLinkedList<T> add(T data){
        Node newNode = new Node(data);
        // If there is no list, make a new list
        if(head == null && tail == null) {
            head = newNode;
            tail = newNode;
            size++;
            return this;
        }

        // Add newNode before the head if that's where it belongs
        if(comparator.compare(newNode.data, head.data) < 0){
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            size++;
            return this;
        }

        // Add newNode after tail if that's where it belongs
        if(comparator.compare(newNode.data, tail.data) > 0){
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
            return this;
        }

        // Add newNode somewhere in between the head and the tail
        Node current = head;
        while(current.next != null){
            if (comparator.compare(newNode.data, current.data) >= 0 && comparator.compare(newNode.data, current.next.data) <= 0) {
                newNode.next = current.next;
                newNode.prev = current;
                current.next.prev = newNode;
                current.next = newNode;
                size++;
                return this;
            }
            current = current.next;
        }

        return this;
    }

    /**
     * UnsupportedOperation for this class
     * @param data the data of the node to be added to the list
     * @return UnsupportedOperationException
     * @throws UnsupportedOperationException Always thrown; this operation is not supported for a sorted linked list
     */
    @Override
    public BasicDoubleLinkedList<T> addToEnd(T data) throws UnsupportedOperationException{
        throw new UnsupportedOperationException("Invalid operation for sorted list");
    }

    /**
     * UnsupportedOperation for this class
     * @param data the data of the node to be added to the list
     * @return UnsupportedOperationException
     * @throws UnsupportedOperationException Always thrown; this operation is not supported for a sorted linked list
     */
    public BasicDoubleLinkedList<T> addToFront(T data) throws UnsupportedOperationException{
        throw new UnsupportedOperationException("Invalid operation for sorted list");
    }

    /**
     * Calls the father class's iterator method and creates a new iterator for this instance of the class
     * @return an instance of ListIterator<T>
     */
    @Override
    public ListIterator<T> iterator(){
        return super.iterator();
    }

    /**
     * Calls the father class's remove method; removes a specific element from the list
     * @param data the data of the element to be removed
     * @param comparator instance of Comparator<T> used to find the element with the targetData
     * @return a reference to this instance of the class
     */
    public SortedDoubleLinkedList<T> remove (T data, Comparator<T> comparator){
        super.remove(data, comparator);
        return this;
    }

}
