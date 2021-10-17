import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.ListIterator;

public class SortedDoubleLinkedListStudentTest {

    Comparator<String> comparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    };
    SortedDoubleLinkedList<String> sortedDoubleLinkedList = new SortedDoubleLinkedList<>(comparator);

    @Before
    public void setUp(){
        sortedDoubleLinkedList.add("1");
        sortedDoubleLinkedList.add("2");
        sortedDoubleLinkedList.add("3");
    }

    @After
    public void tearDown(){
        sortedDoubleLinkedList = null;
    }

    @Test
    public void testAddingTwoOFTheSameElementsOnTheList(){
        ListIterator<String> iterator = sortedDoubleLinkedList.iterator();

        assertEquals("1", iterator.next());
        assertEquals("2", iterator.next());
        assertEquals("3", iterator.next());

        assertEquals("3", iterator.previous());
        assertEquals("2", iterator.previous());
        assertEquals("1", iterator.previous());

        sortedDoubleLinkedList.add("1");
        assertEquals("1", iterator.next());
        assertEquals("1", iterator.next());
    }
}
