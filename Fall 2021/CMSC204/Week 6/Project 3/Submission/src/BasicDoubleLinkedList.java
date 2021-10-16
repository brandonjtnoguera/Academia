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

    public boolean isNotEmpty(){
        return head != null && tail != null;
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
        return new LinkedListIterator();
    }

    public BasicDoubleLinkedList<T> remove(T targetData, Comparator<T> comparator){
        // If data is at head
        if(comparator.compare(head.data, targetData) == 0){
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

    public ArrayList<T> toArrayList(){
        Node current = head;
        ArrayList<T> list = new ArrayList<>();
        while(current != null){
            list.add(current.data);
            current = current.next;
        }
        return list;
    }

    public int getSize() {
        return size;
    }

    public void clear(){
        head = tail = null;
    }

    public boolean thereIsOnlyOneElementInTheList(){
        return head.prev == null && head.next == null && tail.prev == null && tail.next == null;
    }

    public class Node{
        protected T data;
        protected Node next;
        protected Node prev;

        public Node(T data){
            this.data = data;
            next = prev =  null;
        }

        public Node(T data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    public class LinkedListIterator implements ListIterator<T>{
            Node current = head;
            Node beforeCurrent;

            @Override
            public boolean hasNext(){
                return current != null;
        }

            @Override
            public T next() throws NoSuchElementException{
                if(!hasNext()) throw new NoSuchElementException();
                T data;
                beforeCurrent = current;
                current = current.next;
                data = beforeCurrent.data;
                return data;
        }

            @Override
            public boolean hasPrevious() {
                if(thereIsOnlyOneElementInTheList() && current != null) return true;
                else return beforeCurrent != null;
        }

            @Override
            public T previous() throws NoSuchElementException{
                if(!hasPrevious()) throw new NoSuchElementException();
                T data;
              if(thereIsOnlyOneElementInTheList()){
                   data = current.data;
                   current = beforeCurrent;
                   return data;
                }
                current = beforeCurrent;
                beforeCurrent = beforeCurrent.prev;
                data = current.data;
                return data;

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
    }
}
