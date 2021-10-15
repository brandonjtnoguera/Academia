import java.util.*;

public class BasicDoubleLinkedList<T> implements Iterable<T> {
    protected Node<T> head;
    protected Node<T> tail;
    protected int size = 0;

    public boolean isEmpty(){
        return tail == null && head == null;
    }

    public BasicDoubleLinkedList<T> addToEnd(T data){
        Node<T> newNode = new Node<>(data);
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
        Node<T> newNode = new Node<>(data);
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
        return new IteratorBoi<>(head);
    }

    public BasicDoubleLinkedList<T> remove(T targetData, Comparator<T> comparator){
        Node<T> current = head;
        Node<T> removedNode = null;
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
        Node<T> current = head;
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

    public class Node<T>{
        protected T data;
        protected Node<T> next;
        protected Node<T> prev;

        public Node(T data){
            this.data = data;
            next = null;
            prev = null;
        }

        public Node(T data, Node<T> next, Node<T> prev){
            this.next = next;
            this.prev = prev;
            this.data = data;
        }
    }
    public class IteratorBoi<T> implements ListIterator<T> {
        private Node<T> current;

        public IteratorBoi(Node<T> current){
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            // if list isn't empty, and we're not at the tail, thn there's a next value
            return !isEmpty() && current != tail;
        }

        @Override
        public T next() throws NoSuchElementException{
            //if(!hasNext()) throw new NoSuchElementException();
            T data = current.data;
            current = current.next;
            return data;
        }
        @Override
        public boolean hasPrevious() {
            return !isEmpty() && current != head;
        }
        @Override
        public T previous() throws NoSuchElementException{
            //if(!hasPrevious()) throw new NoSuchElementException();
            T data = current.data;
            current = current.prev;
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
