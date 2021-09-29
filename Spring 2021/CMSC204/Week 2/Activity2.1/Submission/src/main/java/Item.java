package shopping_cart;
/*
YOOO WE WERE WORKING ON CHECK INTEGRITY
 */
/**
 * A class to represent a bag of items in a store
 * @author Brandon Tenorio
 */

public final class Item<T> implements BagInterface<T> {

    private boolean integrityOk;
    private static final int MAX_CAPACITY = 10000;
    private int currentSize;
    private String name;
    private T[] bag;
    private int price;
    private static final int DEFAULT_CAPACITY = 25;

    /**
     * Default constructor declares an empty array of size 25, which is the default capacity. Invokes parameterized constructor
     */
    public Item(){
        this(DEFAULT_CAPACITY);
    }

    /**
     * Constructor creates an Item object initializing the name and price fields
     * @param name the name of the item
     * @param price the price of the item
     */
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Parameterized constructor creates an array given an initial capacity set by the client
     * @param desiredCapacity The integer representing the size of the array
     */
    public Item(int desiredCapacity){
        integrityOk = false;
        if(desiredCapacity <= MAX_CAPACITY){
            // The cast is safe because this array contains null entries
            @SuppressWarnings("unchecked")
            T[] tempBag = (T[]) new Object[desiredCapacity];
            bag = tempBag;
            currentSize = 0;
            integrityOk = true;
        }
        else throw new IllegalStateException("Attempted to create a bag whose capacity exceeds the allowed maximum.");
    }

    /**
     * Checks to see if the bag is empty
     * @return true if the bag is empty, false otherwise
     */
    public boolean isEmpty() {
        return currentSize == 0;
    }

    /**
     * Gets the current size of this bag
     * @return the size of this bag
     */
    public int getCurrentSize() {
        return currentSize;
    }

    /**
     * Retrieves the price of an Item
     * @return the price of an item
     */
    public int getPrice() {
        return price;
    }

    /**
     * Adds a new Item to the bag
     * @param newItem a new Item object to be added to the bag
     * @return true if the addition was successful, false otherwise
     */
    public boolean add(T newItem) {
        checkIntegrity();
        if (isArrayFull()) return false;
        else{
            bag[currentSize] = newItem;
            currentSize++;
        }
        return true;
    }

    /**
     * Checks to see if the array is full
     * @return true if array is full, false otherwise
     */
    private boolean isArrayFull() {
        return currentSize >= bag.length;
    }

    /**
     * Checks to see if the bag is corrupt
     */
    private void checkIntegrity() {
        if(!integrityOk) throw new SecurityException("Array is corrupt");
    }

    /**
     * Removes the last item in the array
     * @return the item that was just removed
     */
    public T remove() {
        checkIntegrity();
        return removeItem(currentSize - 1);
    }

    /**
     * Retrieves the position of a specific item in the array
     * @param anItem item tob e seached for
     * @return the position of the item in the array
     */
    private int getIndexOf(T anItem){
        int pos = -1;
        boolean found = false;
        int i =0;
        while(!found && (i < currentSize)){
            if(anItem.equals(bag[i])){
                found = true;
                pos = i;
            }
            else i++;
        }
        return pos;
    }

    /**
     * Removes a specific item from the array
     * @param anItem the item to be removed
     * @return the item that was removed
     */
    public boolean remove(T anItem) {
        checkIntegrity();
        int i = getIndexOf(anItem);
        T item = removeItem(i);
        return anItem.equals(item);
    }

    /**
     * Removes a specific item from the array
     * @param givenIndex the location of the item
     * @return the item that was removed
     */
    private T removeItem(int givenIndex){
        T item = null;
        if(!isEmpty() && (givenIndex >= 0)){
            item = bag[givenIndex];
            bag[givenIndex] = bag[currentSize - 1];
            bag[currentSize - 1] = null;
            currentSize--;
        }
        return item;
    }

    /**
     * Clears the entire array
     */
    public void clear() {
        while(!isEmpty()) remove();
    }

    /**
     * Gets how many times a particular item appears in this bag
     * @param anItem the item to be searched for
     * @return how many times anItem appears in this bag
     */
    public int getFrequencyOf(T anItem) {
        checkIntegrity();
        int counter = 0;
        for(int i = 0; i < currentSize; i++){
            if(anItem.equals(bag[i])) counter++;
        }
        return counter;
    }

    /**
     * Searches through the bag to see if it contains a specific item
     * @param anItem item to be searched for
     * @return true if the item was found, false otherwise
     */
    public boolean contains(T anItem) {
        checkIntegrity();
        boolean found = false;
        int i = 0;
        while(!found && (i < currentSize)){
            if(anItem.equals(bag[i])) found = true;
            else i++;
        }
        return found;
    }

    /**
     * Retrieves all entriesd in the array
     * @return An array of all the entries in the bag
     */
    public T[] toArray() {
        checkIntegrity();
        // Cast is safe because array is filled with null entries
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[currentSize]; // Unchecked cast
        for(int i = 0; i < currentSize; i++){
            result[i] = bag[i];
        }
        return result;
    }

    /**
     * Retrieves information about a specific item
     * @return information about an item
     */
    public String toString() {
        return name + ("\t$" + price / 100 + "." +
                price % 100);
    }
}
