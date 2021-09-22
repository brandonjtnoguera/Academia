import java.util.ArrayList;

public class NotationStack<T> implements StackInterface<T>{
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

    private Node top;
    private int size;
    public final int capacity;

    /**
     * Parameterized Constructor
     * @param capacity
     */
    public NotationStack(int capacity){
        top = null;
        this.capacity = capacity;
    }

    /**
     * Checks if stack is empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Checks if stack is full
     * @return true if full, false otherwise
     */
    public boolean isFull() {
        return size >= capacity;
    }

    /**
     * Removes the top entry from the stack
     * @return the data from the top entry
     * @throws StackUnderflowException if stack is empty
     */
    public T pop() throws StackUnderflowException {
        if(isEmpty()) throw new StackUnderflowException();
        T returnedNode = top();
        top = top.getNext();
        size--;
        return returnedNode;
    }

    /**
     * Retrieves the top entry in the stack
     * @return the data from the top entry in the stack
     * @throws StackUnderflowException if stack is empty
     */
    public T top() throws StackUnderflowException {
        if(isEmpty()) throw new StackUnderflowException();
        return top.getData();
    }

    /**
     * Retrieves the current total entries in the stack
     * @return current total entries in the stack
     */
    public int size() {
        return size;
    }

    /**
     * Adds a new entry to the top of the stack
     * @param newEntry an entry to be added
     * @return true if the operation was successful, false otherwise
     * @throws StackOverflowException if stack is full
     */
    public boolean push(T newEntry) throws StackOverflowException{
        if(isFull()) throw new StackOverflowException();
        top = new Node(newEntry, top);
        size++;
        return true;
    }

    /**
     * Returns the string representation of all the entries in the stack from bottom to top
     * @return string representation of  the stack from bottom to top
     */
    @Override
    public String toString(){
        NotationStack<T> reversedStack = reverseStack(this);
        String stackString = "";


        // Creates the String we need and puts the stack back together
        while(reversedStack.size() > 0){
            this.push(reversedStack.top());
            stackString += reversedStack.pop();
        }
        return stackString;
    }

    /**
     * Reverses a stack from top to bottom -> bottom to top
     * @param regularStack stack to be reversed
     * @return the reversed stack
     */
    private NotationStack<T> reverseStack(NotationStack<T> regularStack) {
        NotationStack<T> reversedStack = new NotationStack<>(regularStack.capacity);

        // Reverses the stack
        while(regularStack.size() > 0){
            reversedStack.push(regularStack.pop());
        }
        return reversedStack;
    }

    /**
     * Returns string representation from bottom to top of all the entries in this stack with a delimiter in between each entry
     * @param delimiter a delimiter to be added in between all the entries
     * @return string representation of entries in the stack
     */
    public String toString(String delimiter) {
        NotationStack<T> reversedStack = reverseStack(this);
        String delimiterStackString = "";


        // Creates the String we need and puts the stack back together
        while(reversedStack.size() > 0){
            this.push(reversedStack.top());
            delimiterStackString += reversedStack.pop() + delimiter;
        }

        return delimiterStackString.substring(0, (delimiterStackString.length() - 1));
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
     * Fills the Stack with the elements of the ArrayList. Bottom stack object is the same as first element in arrayList
     * @param list elements to be added to the Stack from bottom to top
     */
    public void fill(ArrayList<T> list) {
        ArrayList<T> clone = clone(list);
        for (T element : clone) push(element);
    }
}