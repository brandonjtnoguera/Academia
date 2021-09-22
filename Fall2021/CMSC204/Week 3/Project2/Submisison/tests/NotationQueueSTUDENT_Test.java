import org.junit.*;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Student tests of NotationQueue.java
 * @author Brandon Tenorio
 */
public class NotationQueueSTUDENT_Test {
    public int capacity = 5;

    ArrayList<String> someGroceryShoppingListIFoundOnTheInternet = new ArrayList<>();

    NotationQueue<String> stringQueue = new NotationQueue<>(capacity); //[0-4]
    NotationQueue<Double> doublesQueue = new NotationQueue<>(capacity); //[5-9]
    NotationQueue<Integer> integerQueue = new NotationQueue<>(capacity); //[10-14]

    NotationQueue<String> emptyQueue = new NotationQueue<>(capacity);

    @Before
    public void setUp() throws Exception {
        for (int i = 0; i < 15; i++){
            switch(i){
                case 0,1,2,3,4 -> stringQueue.enqueue(String.valueOf(i));
                case 5,6,7,8,9 -> doublesQueue.enqueue((double)(i));
                case 10,11,12,13,14 -> integerQueue.enqueue(i);
            }
        }
    }

    @After
    public void tearDown() throws Exception {
        stringQueue = null;
        doublesQueue = null;
        integerQueue = null;
        emptyQueue = null;
    }

    @Test
    public void testIsEmpty() {
        assertTrue(emptyQueue.isEmpty());

        for(int i = 0; i < capacity; i++){
            assertFalse(stringQueue.isEmpty());
            stringQueue.dequeue();
        }
        assertTrue(stringQueue.isEmpty());

        for(int i = 0; i < 5; i++){
            assertFalse(doublesQueue.isEmpty());
            doublesQueue.dequeue();
        }
        assertTrue(doublesQueue.isEmpty());

        for(int i = 0; i < 5; i++){
            assertFalse(integerQueue.isEmpty());
            integerQueue.dequeue();
        }
        assertTrue(integerQueue.isEmpty());
    }

    @Test
    public void testIsFull() {
        assertFalse(emptyQueue.isFull());

        assertTrue(stringQueue.isFull());
        for(int i = 0; i < capacity; i++){
            stringQueue.dequeue();
            assertFalse(stringQueue.isFull());
        }
        assertFalse(stringQueue.isFull());


        assertTrue(doublesQueue.isFull());
        for(int i = 0; i < 5; i++){
            doublesQueue.dequeue();
            assertFalse(doublesQueue.isFull());
        }
        assertFalse(doublesQueue.isFull());

        assertTrue(integerQueue.isFull());
        for(int i = 0; i < 5; i++){
            integerQueue.dequeue();
            assertFalse(integerQueue.isFull());
        }
        assertFalse(integerQueue.isFull());
    }

    @Test(expected = QueueUnderflowException.class)
    public void testPeek() {
        String stringQueueFront = stringQueue.peek();
        int intQueueFront = integerQueue.peek();
        double doubleQueueFront = doublesQueue.peek();

        for(int i =0; i < capacity + 1; i++){
            switch(i){
                case 0 -> {
                    assertEquals("0", stringQueueFront);
                    stringQueue.dequeue();
                    stringQueueFront = stringQueue.peek();

                    assertEquals(5.0, doubleQueueFront, .001);
                    doublesQueue.dequeue();
                    doubleQueueFront = doublesQueue.peek();

                    assertEquals(10, intQueueFront);
                    integerQueue.dequeue();
                    intQueueFront = integerQueue.peek();
                }
                case 1,2,3 -> {
                    assertNotEquals("0", stringQueueFront);
                    stringQueue.dequeue();
                    stringQueueFront = stringQueue.peek();

                    assertNotEquals(5.0, doubleQueueFront, .001);
                    doublesQueue.dequeue();
                    doubleQueueFront = doublesQueue.peek();

                    assertNotEquals(10, intQueueFront);
                    integerQueue.dequeue();
                    intQueueFront = integerQueue.peek();
                }
                case 4 -> {
                    stringQueueFront = stringQueue.dequeue();
                    intQueueFront = integerQueue.dequeue();
                    doubleQueueFront = doublesQueue.dequeue();

                    assertEquals("4", stringQueueFront);
                    assertEquals(9.0, doubleQueueFront, .001);
                    assertEquals(14, intQueueFront);
                }
                case 5 /* This case throws an exception cause queue is empty by now*/-> {
                    stringQueue.peek();
                    doublesQueue.peek();
                    integerQueue.peek();
                }
            }
        }
    }

    @Test(expected = QueueUnderflowException.class)
    public void testDequeue() {
        /* Trying to deque an empty queue throws an exception. All queue capacities in here are [0-4], for loop goes up to 5*/
        for (int i = 0; i < capacity + 1; i++){
            stringQueue.dequeue();
            doublesQueue.dequeue();
            integerQueue.dequeue();
        }
    }

    @Test
    public void testSize() {
        for (int i = 5; i > 0; i--){
            assertEquals(stringQueue.size(), i);
            assertEquals(doublesQueue.size(), i);
            assertEquals(integerQueue.size(), i);
            stringQueue.dequeue();
            doublesQueue.dequeue();
            integerQueue.dequeue();
        }
    }

    @Test(expected = QueueOverflowException.class)
    public void testEnqueue() {
        /* Add one extra entry to the queue. This throws an exception */
        stringQueue.enqueue("THIS FAILS LMAO");
        doublesQueue.enqueue(420.69);
        integerQueue.enqueue(42069);
    }

    @Test
    public void testToString() {
        assertEquals("01234", stringQueue.toString());
        assertEquals("5.06.07.08.09.0", doublesQueue.toString());
        assertEquals("1011121314", integerQueue.toString());
    }

    @Test
    public void testToStringDelimiter() {
        assertEquals("0/1/2/3/4", stringQueue.toString("/"));
        assertEquals("5.0,6.0,7.0,8.0,9.0", doublesQueue.toString(","));
        assertEquals("10&11&12&13&14", integerQueue.toString("&"));
    }

    @Test
    public void testFill() {

        someGroceryShoppingListIFoundOnTheInternet.add("Tomato sauce");
        someGroceryShoppingListIFoundOnTheInternet.add("Mustard");
        someGroceryShoppingListIFoundOnTheInternet.add("Barbecue sauce");
        someGroceryShoppingListIFoundOnTheInternet.add("Red-wine vinegar");
        someGroceryShoppingListIFoundOnTheInternet.add("Salsa");

        emptyQueue.fill(someGroceryShoppingListIFoundOnTheInternet);

        assertEquals(5,emptyQueue.size());
        assertEquals("Tomato sauce", emptyQueue.dequeue());
        assertEquals("Mustard", emptyQueue.dequeue());
        assertEquals("Barbecue sauce", emptyQueue.dequeue());
        assertEquals("Red-wine vinegar", emptyQueue.dequeue());
        assertEquals("Salsa", emptyQueue.dequeue());
    }
}