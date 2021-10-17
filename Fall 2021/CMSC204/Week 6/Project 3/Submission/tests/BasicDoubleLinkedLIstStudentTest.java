/**
 * @author Brandon Tenorio
 */

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class BasicDoubleLinkedLIstStudentTest {

    BasicDoubleLinkedList<String> basicDoubleLinkedList = new BasicDoubleLinkedList<>();
    BasicDoubleLinkedList<String> soloNode = new BasicDoubleLinkedList<>();

    Comparator<String> comparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    };

    @Before
    public void setUp(){

        basicDoubleLinkedList.addToFront("3");
        basicDoubleLinkedList.addToFront("2");
        basicDoubleLinkedList.addToFront("1");

        soloNode.addToFront("1");
    }

    @After
    public void tearDown(){
        basicDoubleLinkedList = null;
    }

    @Test
    public void should_add_4_to_end_of_list(){
        basicDoubleLinkedList.addToEnd("4");
        assertEquals("4", basicDoubleLinkedList.retrieveLastElement());
    }

    @Test
    public void get_first_should_return_1(){
        assertEquals("1", basicDoubleLinkedList.getFirst());
    }

    @Test
    public void retrieve_first_then_get_first_should_return_1_then_2(){
        assertEquals("1", basicDoubleLinkedList.retrieveFirstElement());
        assertEquals("2", basicDoubleLinkedList.getFirst());
    }

    @Test
    public void get_last_should_return_3(){
        assertEquals("3", basicDoubleLinkedList.getLast());
    }

    @Test
    public void retrieve_last_then_get_last_should_return_3_then_2(){
        assertEquals("3", basicDoubleLinkedList.retrieveLastElement());
        assertEquals("2", basicDoubleLinkedList.getLast());
    }

    @Test
    public void hasNext_should_return_false_after_3_calls_to_next(){
        ListIterator<String> iterator = basicDoubleLinkedList.iterator();

        iterator.next();
        iterator.next();
        iterator.next();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void hasNext_should_return_true_before_first_call_to_next_and_immediately_after_first_call_to_next(){
        ListIterator<String> iterator = basicDoubleLinkedList.iterator();

        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
    }

    @Test
    public void hasPrevious_should_return_false_before_any_calls_to_next(){
        ListIterator<String> iterator = basicDoubleLinkedList.iterator();

        assertFalse(iterator.hasPrevious());
    }

    @Test
    public void hasPrevious_should_return_false_after_3_calls_to_next(){
        ListIterator<String> iterator = basicDoubleLinkedList.iterator();

        assertEquals("1", iterator.next());
        assertEquals("2", iterator.next());
        assertEquals("3", iterator.next());
        assertTrue(iterator.hasPrevious());

        assertEquals("3", iterator.previous());
        assertEquals("2", iterator.previous());
        assertEquals("1", iterator.previous());
        assertFalse(iterator.hasPrevious());
    }

    @Test
    public void should_return_linked_list_in_reverse_order(){
        ListIterator<String> iterator = basicDoubleLinkedList.iterator();

        assertEquals("1",iterator.next());
        assertEquals("2",iterator.next());
        assertEquals("3",iterator.next());
        //assertTrue(iterator.hasPrevious());

        assertEquals("3",iterator.previous());
        assertEquals("2",iterator.previous());
        assertEquals("1",iterator.previous());

        assertEquals("1",iterator.next());
        assertEquals("2",iterator.next());
        assertEquals("3",iterator.next());
    }


    @Test
    public void adding_1_to_soloNode_should_return_1_when_retrieving_first_or_last_element(){
        soloNode.addToEnd("1");
        assertEquals("1", soloNode.retrieveFirstElement());
        assertEquals("1", soloNode.retrieveLastElement());
    }

    @Test(expected = NoSuchElementException.class)
    public void removing_data_that_is_not_on_list_throws_NoSuchElementException(){
        soloNode.remove("2", comparator);
    }

    @Test
    public void removing_node_between_head_and_tail_should_be_successful(){
        // null <- 1 <-> 2 <-> 3 -> null
        basicDoubleLinkedList.remove("2", comparator);
        // null <- 1 <-> 3 -> null
        assertEquals("1", basicDoubleLinkedList.head.data);
        assertEquals("3", basicDoubleLinkedList.head.next.data);

    }

    @Test(expected = NoSuchElementException.class)
    public void testRetrieveFirstElement(){
        assertEquals("1", basicDoubleLinkedList.getFirst());
        assertEquals("1", basicDoubleLinkedList.retrieveFirstElement());

        assertEquals("2", basicDoubleLinkedList.getFirst());
        assertEquals("2", basicDoubleLinkedList.retrieveFirstElement());

        assertEquals("3", basicDoubleLinkedList.getFirst());
        assertEquals("3", basicDoubleLinkedList.retrieveFirstElement());

        basicDoubleLinkedList.retrieveFirstElement();

    }

    @Test(expected = NoSuchElementException.class)
    public void testRetrieveLastElement(){
        assertEquals("3", basicDoubleLinkedList.getLast());
        assertEquals("3", basicDoubleLinkedList.retrieveLastElement());

        assertEquals("2", basicDoubleLinkedList.getLast());
        assertEquals("2", basicDoubleLinkedList.retrieveLastElement());

        assertEquals("1", basicDoubleLinkedList.getLast());
        assertEquals("1", basicDoubleLinkedList.retrieveLastElement());

        basicDoubleLinkedList.retrieveLastElement();
    }

    @Test
    public void testRetrievingFirstThenAddingThenRetrievingFirst(){
        // Retrieving
        assertEquals("1", soloNode.retrieveFirstElement());

        // Adding
        soloNode.addToEnd("2");
        assertEquals("2", soloNode.getFirst());
        assertEquals("2", soloNode.getLast());

        // Retrieving
        assertEquals("2", soloNode.retrieveFirstElement());
    }

    @Test
    public void testRetrievingLastThenAddingThenRetrievingLast(){
        // Retrieving
        assertEquals("1", soloNode.retrieveLastElement());

        // Adding
        soloNode.addToFront("2");
        assertEquals("2", soloNode.getLast());
        assertEquals("2", soloNode.getFirst());

        // Retrieving
        assertEquals("2", soloNode.retrieveFirstElement());
    }

    @Test
    public void soloNode_iterator_should_return_true_after_1_call_to_hasPrevious_but_should_return_false_after_calling_previous_once(){
        ListIterator<String> iterator = soloNode.iterator();

        assertTrue(iterator.hasPrevious());
        iterator.previous();
        assertFalse(iterator.hasPrevious());
    }

    @Test
    public void soloNode_iterator_should_return_true_after_1_call_to_hasNext_but_should_return_false_after_calling_next_once(){
        ListIterator<String> iterator = soloNode.iterator();

        assertTrue(iterator.hasNext());
        iterator.next();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testing_hasNext_and_hasPrevious_on_a_list_with_only_2_elements(){
        ListIterator<String> iterator = soloNode.iterator();

        soloNode.addToEnd("2");
        assertTrue(iterator.hasNext());
        assertTrue(iterator.hasPrevious());
        iterator.next();
        assertTrue(iterator.hasNext());
        assertTrue(iterator.hasPrevious());
        iterator.next();
        assertTrue(iterator.hasPrevious());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testCallingPreviousFollowedByNextOnSoloNodeShouldPrintNumberOneRepeatedly(){
        ListIterator<String> iterator = soloNode.iterator();

        assertEquals("1", iterator.next());
        assertEquals("1", iterator.previous());
    }

    @Test
    public void testDeletingAListThenAddingToItThenUsingIteratorOnItShouldReturn1(){
        ListIterator<String> iterator = soloNode.iterator();

        soloNode.remove("1", comparator);

        soloNode.addToEnd("2");

        // You have to reset the iterator object in order for this to work, and I have no clue how to do that from the class
        // I want the class to know when the list is not empty after having ben empty, and then restart the iterator but idk how to do that
        // The farthest i got on my pseudocode is:
        // After any removals, if the list is empty, reset the iterator. After the list becomes not empty, set the iterator to point at the current list's head
        // No clue how to do that tho
        iterator = soloNode.iterator();
        assertEquals("2", iterator.next());
    }
}
