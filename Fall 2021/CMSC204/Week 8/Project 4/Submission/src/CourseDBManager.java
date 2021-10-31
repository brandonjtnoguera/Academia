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
    public void readFile(File input) throws FileNotFoundException, InvalidCourseFormatException {
        Scanner reader = new Scanner(input);

        /*
        * course[0] = courseID
        * course[1] = CRN
        * course[2] = credits
        * course[3] = room number
        * from course[4] to course.length = instructor name
        * name = instructor name
        * */
        while(reader.hasNext()){
            StringBuilder line = new StringBuilder();
            StringBuilder name = new StringBuilder();
            String[] course;

            line.append(reader.nextLine());

            while(line.toString().startsWith("#")){
                line.setLength(0);
                line.append(reader.nextLine());
            }
            if(line.toString().equals("")) continue;
            course = line.toString().split("\\s+");

            boolean containsLetters = false;
            for(int i = 0; i < course[1].length(); i++){
                if(Character.isLetter(course[1].charAt(i))) containsLetters = true;
            }

            if(!course[0].startsWith("CMSC")) throw new InvalidCourseFormatException("Invalid or missing course ID");
            else if(course[1].length() !=5 || containsLetters) throw new InvalidCourseFormatException("Invalid or missing course CRN");
            else if(!Character.isDigit(course[2].charAt(0))) throw new InvalidCourseFormatException("Invalid or missing course credit amount");
            else if(!course[3].equals("Distance-Learning") && !Character.isDigit(course[3].charAt(2))) throw new InvalidCourseFormatException("Invalid or missing course room number");

            for(int i = 4; i < course.length; i++){
                name.append(course[i]).append(" ");
            }
            name.deleteCharAt(name.length() - 1);

            CourseDBElement newCourse = new CourseDBElement(course[0],Integer.parseInt(course[1]), Integer.parseInt(course[2]), course[3], name.toString());

            courseDBStructure.add(newCourse);

        }
    }

    /**
     * Return an ArrayList of the courses in the order of CRN.
     */
    @Override
    public ArrayList<String> showAll() {
        ArrayList<CourseDBElement> listOfCoursesInArrayList = new ArrayList<>();
        ArrayList<String> listOfCoursesAsStringObjectsInArrayList;

        for(int i = 0; i < courseDBStructure.getTableSize(); i++){
            if(courseDBStructure.hashTable[i] != null){
                listOfCoursesInArrayList.addAll(courseDBStructure.hashTable[i]);
            }
        }
        // .stream() returns a sequential stream of the CDB elements in listOfCoursesInArrayList
        // .map() returns CDB elements as String objects
        // .collect() adds those objects to the list
        listOfCoursesAsStringObjectsInArrayList = (ArrayList<String>) listOfCoursesInArrayList.stream()
                .map(s -> s.toString())
                .collect(Collectors.toList());
        return listOfCoursesAsStringObjectsInArrayList;
    }
}
