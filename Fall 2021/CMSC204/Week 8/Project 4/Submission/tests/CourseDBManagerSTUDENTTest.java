import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.*;

import static org.junit.Assert.*;

public class CourseDBManagerSTUDENTTest {
    private CourseDBManager manager;

    @Before
    public void setUp() throws Exception {
        manager = new CourseDBManager();
    }

    @After
    public void tearDown() throws Exception {
        manager = null;
    }

    @Test
    public void add() {
        try {
            manager.add("CMSC204", 30569, 4, "SC123", "Dwayne The Rock Johnson");
            assertEquals(1, manager.showAll().size());
            manager.add("CMSC204", 30569, 4, "SC123", "Dwayne The Rock Johnson");
            assertEquals(1, manager.showAll().size());
            manager.add("CMSC204", 30569, 4, "SC123", "Dwayne The Rock Johnson");
            assertEquals(1, manager.showAll().size());
            manager.add("CMSC204", 30569, 4, "SC123", "Dwayne The Rock Johnson");
            assertEquals(1, manager.showAll().size());
        } catch (Exception e) {
            fail("Shouldn't throw exception");
        }
    }

    @Test
    public void get() {
        manager.add("CMSC203", 42069, 4, "SC222", "Kanye West");
        manager.add("CMSC207", 69420, 4, "SC111", "Kelpy G.");
        ArrayList<String> list = manager.showAll();

        assertEquals(list.get(0), manager.get(42069).toString());
        assertEquals(list.get(1), manager.get(69420).toString());
    }

    @Test
    public void readFile() {
        try {
            File inputFile = new File("test2.txt");
            PrintWriter inFile = new PrintWriter(inputFile);
            inFile.println("CMSC204 42069 4 ZC333 Esteban Julio Ricardo Montoya De la Rosa Ramirez");
            inFile.print("CMSC207 10101 4 SC444 Simu Liu");
            inFile.close();

            assertEquals(0, manager.showAll().size());
            manager.readFile(inputFile);
            assertEquals(2, manager.showAll().size());
        } catch (Exception e) {
            fail("Shouldn't throw exception");
        }
    }

    @Test
    public void showAll() {
        manager.add("CMSC203", 42069, 4, "SC222", "Kanye West");
        manager.add("CMSC207", 69420, 4, "SC111", "Kelpy G.");
        manager.add("CMSC207", 10101, 4, "ZC333", "Esteban Julio Ricardo Montoya De la Rosa Ramirez");
        ArrayList<String> list = manager.showAll();

        assertEquals(list.get(0),
                "\nCourse:CMSC203 CRN:42069 Credits:4 Instructor:Kanye West Room:SC222");
        assertEquals(list.get(1),
                "\nCourse:CMSC207 CRN:69420 Credits:4 Instructor:Kelpy G. Room:SC111");
        assertEquals(list.get(2),
                "\nCourse:CMSC207 CRN:10101 Credits:4 Instructor:Esteban Julio Ricardo Montoya De la Rosa Ramirez Room:ZC333");
    }
}