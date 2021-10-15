//import org.junit.After;
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.ListIterator;
//
//public class BasicDoubleLinkedLIstStudentTest {
//    BasicDoubleLinkedList<String> basicDoubleLinkedList = new BasicDoubleLinkedList<>();
//
//
//
//    @Before
//    public void setUp(){
//
//        basicDoubleLinkedList.addToFront("3");
//        basicDoubleLinkedList.addToFront("2");
//        basicDoubleLinkedList.addToFront("1");
//    }
//
//    @After
//    public void tearDown(){
//        basicDoubleLinkedList = null;
//    }
//
//    @Test
//    public void should_add_4_to_end_of_list(){
//        basicDoubleLinkedList.addToEnd("4");
//        assertEquals("4", basicDoubleLinkedList.retrieveLastElement());
//    }
//
//    @Test
//    public void get_first_should_return_1(){
//        assertEquals("1", basicDoubleLinkedList.getFirst());
//    }
//
//    @Test
//    public void retrieve_first_then_get_first_should_return_1_then_2(){
//        assertEquals("1", basicDoubleLinkedList.retrieveFirstElement());
//        assertEquals("2", basicDoubleLinkedList.getFirst());
//    }
//
//    @Test
//    public void get_last_should_return_3(){
//        assertEquals("3", basicDoubleLinkedList.getLast());
//    }
//
//    @Test
//    public void retrieve_last_then_get_last_should_return_3_then_2(){
//        assertEquals("3", basicDoubleLinkedList.retrieveLastElement());
//        assertEquals("2", basicDoubleLinkedList.getLast());
//    }
//
//    @Test
//    public void hasNext_should_return_false_after_3_calls_to_next(){
//        ListIterator<String> iterator = basicDoubleLinkedList.iterator();
//
////        System.out.println(iterator.next());
////        System.out.println(iterator.next());
//        iterator.next();
//        iterator.next();
//        iterator.next();
//        assertFalse(iterator.hasNext());
//    }
//
//    @Test
//    public void hasNext_should_return_true_before_first_call_to_next_and_immediately_after_first_call_to_next(){
//        ListIterator<String> iterator = basicDoubleLinkedList.iterator();
//
//        assertTrue(iterator.hasNext());
//        iterator.next();
//        assertTrue(iterator.hasNext());
//        iterator.next();
//    }
//
//    @Test
//    public void hasPrevious_should_return_false_before_any_calls_to_next(){
//        ListIterator<String> iterator = basicDoubleLinkedList.iterator();
//
//        assertFalse(iterator.hasPrevious());
//    }
//
//    @Test
//    public void hasPrevious_should_return_false_after_3_calls_to_next(){
//        ListIterator<String> iterator = basicDoubleLinkedList.iterator();
//
//        assertEquals("1", iterator.next());
//        assertEquals("2", iterator.next());
//        assertEquals("3", iterator.next());
//        assertTrue(iterator.hasPrevious());
//
//        assertEquals("3", iterator.previous());
//        assertEquals("2", iterator.previous());
//        assertEquals("1", iterator.previous());
//        assertFalse(iterator.hasPrevious());
//    }
//
//    @Test
//    public void should_return_linked_list_in_reverse_order(){
//        ListIterator<String> iterator = basicDoubleLinkedList.iterator();
//
//        assertEquals("1",iterator.next());
//        assertEquals("2",iterator.next());
//        assertEquals("3",iterator.next());
//        //assertTrue(iterator.hasPrevious());
//
//        assertEquals("3",iterator.previous());
//        assertEquals("2",iterator.previous());
//        assertEquals("1",iterator.previous());
//
//        assertEquals("1",iterator.next());
//        assertEquals("2",iterator.next());
//        assertEquals("3",iterator.next());
//    }
//}
