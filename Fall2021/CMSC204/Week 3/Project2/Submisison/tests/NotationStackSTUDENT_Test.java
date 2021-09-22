import org.junit.*;
import static org.junit.Assert.*;

/**
 * Student tests of NotationStack.java
 * @author Brandon Tenorio
 */
public class NotationStackSTUDENT_Test {
    NotationStack<String> stringQueue = new NotationStack<>(5);
    NotationStack<Double> doublesQueue = new NotationStack<>(5);
    NotationStack<Integer> integerQueue = new NotationStack<>(5);
    NotationStack<Character> charsQueue = new NotationStack<>(5);

    @Before
    public void setUp() throws Exception {

        for (int i = 0; i < 20; i++){
            switch(i){
                case 0,1,2,3,4 -> stringQueue.push(String.valueOf(i));
                case 5,6,7,8,9 -> doublesQueue.push((double)(i));
                case 10,11,12,13,14 -> integerQueue.push(i);
                case 15,16,17,18,19 -> charsQueue.push((char)(i));
            }
        }
    }

    @After
    public void tearDown() throws Exception {
        stringQueue = null;
        doublesQueue = null;
        integerQueue = null;
        charsQueue = null;
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void isFull() {
    }

    @Test
    public void pop() {
    }

    @Test
    public void top() {
    }

    @Test
    public void size() {
    }

    @Test
    public void push() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void testToString1() {
    }

    @Test
    public void fill() {
    }
}