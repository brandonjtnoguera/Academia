import java.io.*;
import java.util.*;
import java.util.stream.*;

/**
 * @author Brandon Tenorio
 */
public class CourseDBManager implements CourseDBManagerInterface{
    private CourseDBStructure courseDBStructure;

    /**
     * Default constructor creates a hash table (CourseDatabaseStructure) with an initial size of 10
     */
    public CourseDBManager(){
        courseDBStructure = new CourseDBStructure(10);
    }

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
        CourseDBElement CDBE = new CourseDBElement(id, CRN, credits, roomNum, instructor);
        courseDBStructure.add(CDBE);
    }

    /**
     * Get an entry using CourseDBStructure's get method.
     * @param CRN the unique id of the class; also serves a hash code
     */
    @Override
    public CourseDBElement get(int CRN) {
        try{
            return courseDBStructure.get(CRN);
        } catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Read a given file of courses and add them to the DB.
     * @param input file to be read
     */
    @Override
    public void readFile(File input) throws FileNotFoundException {
        Scanner reader = new Scanner(input);

        // TODO LOL
    }

    /**
     * Return an ArrayList of the courses in the order of CRN.
     */
    @Override
    public ArrayList<String> showAll() {
        ArrayList<CourseDBElement> listOfCoursesInArrayList = new ArrayList<>();
        ArrayList<String> listOfCoursesAsStringObjectsInArrayList;

        for(int i = 0; i < courseDBStructure.getTableSize(); i++){
            if(courseDBStructure.hashTable != null){
                listOfCoursesInArrayList.addAll(courseDBStructure.hashTable[i]);
            }
        }
        // .stream() returns a sequential stream of the CDB elements in listOfCoursesInArrayList
        // .map() returns CDB elements as String objects
        // .collect() adds those objects to the list
        listOfCoursesAsStringObjectsInArrayList = (ArrayList<String>) listOfCoursesInArrayList.stream()
                .map(CourseDBElement::toString)
                .collect(Collectors.toList());
        return listOfCoursesAsStringObjectsInArrayList;
    }
}
