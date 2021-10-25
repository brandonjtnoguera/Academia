import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * @author Brandon Tenorio
 */
public class CourseDBManager implements CourseDBManagerInterface{
    /**
     * Create and add an entry using CourseDBStructure's add method.
     * @param id
     * @param crn
     * @param credits
     * @param roomNum
     * @param instructor
     */
    @Override
    public void add(String id, int crn, int credits, String roomNum, String instructor) {

    }

    /**
     * Get an entry using CourseDBStructure's get method.
     * @param crn
     */
    @Override
    public CourseDBElement get(int crn) {
        return null;
    }

    /**
     * Read a given file of courses and add them to the DB.
     * @param input file to be read
     */
    @Override
    public void readFile(File input) throws FileNotFoundException {

    }

    /**
     * Return an ArrayList of the courses in the order of CRN.
     */
    @Override
    public ArrayList<String> showAll() {
        return null;
    }
}
