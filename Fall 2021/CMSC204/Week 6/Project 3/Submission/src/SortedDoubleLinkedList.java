import java.util.*;

public class SortedDoubleLinkedList<T> extends BasicDoubleLinkedList<T>{
    private Comparator<T> comparator;

    public SortedDoubleLinkedList(Comparator<T> comparator2){
        // TODO idk what the constructor is meant to do, do I sort it here?
        super();
        this.comparator = comparator2;
    }

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
            if (comparator.compare(newNode.data, current.data) > 0 && comparator.compare(newNode.data, current.next.data) < 0) {
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

    @Override
    public BasicDoubleLinkedList<T> addToEnd(T data) throws UnsupportedOperationException{
        throw new UnsupportedOperationException("Invalid operation for sorted list");
    }

    public BasicDoubleLinkedList<T> addToFront(T data) throws UnsupportedOperationException{
        throw new UnsupportedOperationException("Invalid operation for sorted list");
    }

    @Override
    public ListIterator<T> iterator(){
        return super.iterator();
    }

    public SortedDoubleLinkedList<T> remove (T data, Comparator<T> comparator){
        super.remove(data, comparator);
        return this;
    }

}
