import java.util.*;

public class BasicDoubleLinkedList<T> implements Iterable<T> {
    protected Node head;
    protected Node tail;
    protected int size = 0;

    public BasicDoubleLinkedList(){
        head = tail = null;
    }

    public boolean isEmpty(){
        return tail == null && head == null;
    }

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

    public T getFirst(){
        return head.data;
    }

    public T getLast(){
        return tail.data;
    }

    public ListIterator<T> iterator() throws UnsupportedOperationException, NoSuchElementException {
        // Anonymous class!!!!!!!
        return new ListIterator<T>() {
            Node current = head;

            @Override
            public boolean hasNext(){
                return current != null;
            }

            @Override
            public T next(){
                if(hasNext()){
                    T data = current.data;
                    current = current.next;
                    return data;
                }
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return current != null;
            }

            @Override
            public T previous() {
                if(hasNext()){
                    T data = current.data;
                    current = current.prev;
                    return data;
                }
                return null;
            }

            @Override
            public int nextIndex() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int previousIndex() {
                throw new UnsupportedOperationException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override
            public void set(T t) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void add(T t) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public BasicDoubleLinkedList<T> remove(T targetData, Comparator<T> comparator){
        Node current = head;
        Node removedNode = null;
        while(current.next != null){
            // TODO ASK PROF IF THIS IS OK
            if(comparator.compare(targetData, current.data) == 0){
                removedNode = current;
                current.next = current.next.next;
            }
            current = current.next;
        }
        size--;
        return this;
    }

    public T retrieveFirstElement(){
        if(head == null) return null;
        T data = head.data;
        head = head.next;
        head.prev = null;
        return data;
    }

    public T retrieveLastElement(){
        if(tail == null) return null;
        T data = tail.data;
        tail = tail.prev;
        tail.next = null;
        return data;
    }

    public ArrayList<T> toArrayList(){
        Node current = head;
        ArrayList<T> list = new ArrayList<>();
        while(current.next != null){
            list.add(current.data);
            current = current.next;
        }
        return list;
    }

    public int getSize() {
        return size;
    }

    public class Node{
        protected T data;
        protected Node next;
        protected Node prev;

        public Node(T data){
            this.data = data;
            next = prev =  null;
        }
    }
}
