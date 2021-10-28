import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * @author Brandon Tenorio
 */
public class CourseDBManager implements CourseDBManagerInterface{
    /**
     * Create and add an entry using CourseDBStructure's add method.
     * @param id the course ID of the class (such as CMSC204)
     * @param CRN the unique id of the class; also serves the purpose of a hashcode
     * @param credits how many credits a class is worth
     * @param roomNum the room number where a class will be held
     * @param instructor the name of the professor teaching the class
     */
    @Override
    public void add(String id, int CRN, int credits, String roomNum, String instructor) {

    }

    /**
     * Get an entry using CourseDBStructure's get method.
     * @param CRN the unique id of the class; also serves a hash code
     */
    @Override
    public CourseDBElement get(int CRN) {
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
