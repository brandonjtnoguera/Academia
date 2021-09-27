import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Student tests of NotationStack.java
 * @author Brandon Tenorio
 */
public class NotationStackSTUDENT_Test {
    public int capacity = 5;

    ArrayList<String> someGroceryShoppingListIFoundOnTheInternet = new ArrayList<>();
    
    NotationStack<String> stringStack = new NotationStack<>(capacity);
    NotationStack<Double> doublesStack = new NotationStack<>(capacity);
    NotationStack<Integer> integerStack = new NotationStack<>(capacity);

    NotationStack<String> emptyStack = new NotationStack<>(capacity);

    @Before
    public void setUp() throws Exception {
        for (int i = 0; i < 15; i++){
            switch(i){
                case 0,1,2,3,4 -> stringStack.push(String.valueOf(i));
                case 5,6,7,8,9 -> doublesStack.push((double)(i));
                case 10,11,12,13,14 -> integerStack.push(i);
            }
        }
    }

    @After
    public void tearDown() throws Exception {
        stringStack = null;
        doublesStack = null;
        integerStack = null;
        emptyStack = null;
    }

    @Test
    public void testIsEmpty() {
        assertTrue(emptyStack.isEmpty());

        for(int i = 0; i < capacity; i++){
            assertFalse(stringStack.isEmpty());
            stringStack.pop();
        }
        assertTrue(stringStack.isEmpty());

        for(int i = 0; i < 5; i++){
            assertFalse(doublesStack.isEmpty());
            doublesStack.pop();
        }
        assertTrue(doublesStack.isEmpty());

        for(int i = 0; i < 5; i++){
            assertFalse(integerStack.isEmpty());
            integerStack.pop();
        }
        assertTrue(integerStack.isEmpty());
    }

    @Test
    public void testIsFull() {
        assertFalse(emptyStack.isFull());

        assertTrue(stringStack.isFull());
        for(int i = 0; i < capacity; i++){
            stringStack.pop();
            assertFalse(stringStack.isFull());
        }
        assertFalse(stringStack.isFull());


        assertTrue(doublesStack.isFull());
        for(int i = 0; i < 5; i++){
            doublesStack.pop();
            assertFalse(doublesStack.isFull());
        }
        assertFalse(doublesStack.isFull());

        assertTrue(integerStack.isFull());
        for(int i = 0; i < 5; i++){
            integerStack.pop();
            assertFalse(integerStack.isFull());
        }
        assertFalse(integerStack.isFull());
    }

    @Test(expected = StackUnderflowException.class)
    public void testPop() {
        /* Trying to deque an empty queue throws an exception. All queue capacities in here are [0-4], for loop goes up to 5*/
        for (int i = 0; i < capacity + 1; i++){
            stringStack.pop();
            doublesStack.pop();
            integerStack.pop();
        }
    }

    @Test(expected = StackUnderflowException.class)
    public void testTop() {
        String stringStackTop = stringStack.top();
        int intQueueTop = integerStack.top();
        double doubleQueueTop = doublesStack.top();

        for(int i =0; i < capacity + 1; i++){
            switch(i){
                case 0 -> {
                    assertEquals("4", stringStackTop);
                    stringStack.pop();
                    stringStackTop = stringStack.top();

                    assertEquals(9.0, doubleQueueTop, .001);
                    doublesStack.pop();
                    doubleQueueTop = doublesStack.top();

                    assertEquals(14, intQueueTop);
                    integerStack.pop();
                    intQueueTop = integerStack.top();
                }
                case 1,2,3 -> {
                    assertNotEquals("4", stringStackTop);
                    stringStack.pop();
                    stringStackTop = stringStack.top();

                    assertNotEquals(9.0, doubleQueueTop, .001);
                    doublesStack.pop();
                    doubleQueueTop = doublesStack.top();

                    assertNotEquals(14, intQueueTop);
                    integerStack.pop();
                    intQueueTop = integerStack.top();
                }
                case 4 -> {
                    stringStackTop = stringStack.pop();
                    intQueueTop = integerStack.pop();
                    doubleQueueTop = doublesStack.pop();

                    assertEquals("0", stringStackTop);
                    assertEquals(5.0, doubleQueueTop, .001);
                    assertEquals(10, intQueueTop);
                }
                case 5 /* This case throws an exception cause stack is empty by now*/-> {
                    stringStack.top();
                    doublesStack.top();
                    integerStack.top();
                }
            }
        }
    }

    @Test
    public void testSize() {
        for (int i = 5; i > 0; i--){
            assertEquals(stringStack.size(), i);
            assertEquals(doublesStack.size(), i);
            assertEquals(integerStack.size(), i);
            stringStack.pop();
            doublesStack.pop();
            integerStack.pop();
        }
    }

    @Test(expected = StackOverflowException.class)
    public void testPush() {
        /* Add one extra entry to the queue. This throws an exception */
        stringStack.push("THIS FAILS LMAO");
        doublesStack.push(420.69);
        integerStack.push(42069);
    }

    @Test
    public void testToString() {
        assertEquals("01234", stringStack.toString());
        assertEquals("5.06.07.08.09.0", doublesStack.toString());
        assertEquals("1011121314", integerStack.toString());
    }

    @Test
    public void testToStringDelimiter() {
        assertEquals("0/1/2/3/4", stringStack.toString("/"));
        assertEquals("5.0,6.0,7.0,8.0,9.0", doublesStack.toString(","));
        assertEquals("10&11&12&13&14", integerStack.toString("&"));
    }

    @Test
    public void testFill() {
        someGroceryShoppingListIFoundOnTheInternet.add("Tomato sauce");
        someGroceryShoppingListIFoundOnTheInternet.add("Mustard");
        someGroceryShoppingListIFoundOnTheInternet.add("Barbecue sauce");
        someGroceryShoppingListIFoundOnTheInternet.add("Red-wine vinegar");
        someGroceryShoppingListIFoundOnTheInternet.add("Salsa");

        emptyStack.fill(someGroceryShoppingListIFoundOnTheInternet);

        assertEquals(5,emptyStack.size());
        assertEquals("Salsa", emptyStack.pop());
        assertEquals("Red-wine vinegar", emptyStack.pop());
        assertEquals("Barbecue sauce", emptyStack.pop());
        assertEquals("Mustard", emptyStack.pop());
        assertEquals("Tomato sauce", emptyStack.pop());
    }
}