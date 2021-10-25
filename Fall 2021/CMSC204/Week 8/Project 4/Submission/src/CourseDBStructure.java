import java.io.IOException;

/**
 * @author Brandon Tenorio
 */
public class CourseDBStructure implements CourseDBStructureInterface{
    /**
     * Use the hashcode of the CourseDatabaseElement to see if it is
     * in the hashtable.
     * If the CourseDatabaseElement does not exist in the hashtable,
     * add it to the hashtable.
     * @param element the CDE to be added
     */
    @Override
    public void add(CourseDBElement element) {

    }

    /**
     * Use the hashcode of the CourseDatabaseElement to see if it is
     * in the hashtable.
     * If the CourseDatabaseElement is in the hashtable, return it
     * If not, throw an IOException
     * @param crn
     * @throws IOException
     */
    @Override
    public CourseDBElement get(int crn) throws IOException {
        return null;
    }

    /**
     * Returns the size of the ConcordanceDataStructure (number of indexes in the array)
     */
    @Override
    public int getTableSize() {
        return 0;
    }
}
