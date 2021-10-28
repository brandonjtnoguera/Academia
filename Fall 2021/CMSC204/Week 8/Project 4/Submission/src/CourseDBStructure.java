import java.io.IOException;
import java.util.LinkedList;

/**
 * Class represents a hash table of linked lists of CourseDatabaseElements
 * @author Brandon Tenorio
 */
public class CourseDBStructure implements CourseDBStructureInterface{
    protected LinkedList<CourseDBElement>[] hashTable;

    /**
     * Parameterized constructor
     * @param size the initial size of hashTable
     */
    @SuppressWarnings("unchecked")
    public CourseDBStructure(int size) {
        hashTable = new LinkedList[size];
    }

    /**
     * Parameterized constructor
     * @param string there's like one instance of this class on the CourseDBStructureTests.java that takes in a String, so this constructor is for that. Other than that I don't know what this String object represents
     * @param size initial size of hashTable
     */
    @SuppressWarnings("unchecked")
    public CourseDBStructure(String string, int size) {
        hashTable = new LinkedList[size];
    }


    /**
     * Checks to see if element is in the table before adding it. If element is not in the table, it adds it
     * @param element the course element to be added
     */
    @Override
    public void add(CourseDBElement element) {
        int index = getHashIndex(element);

        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<>();
            hashTable[index].add(element);
        } else {
            if (hashTable[index].contains(element)) return;
            else hashTable[index].add(element);
        }
    }

    /**
     * Returns a CDBE whose CRN matches the given CRN.
     * @param CRN the hashcode of CDBE
     * @return A CourseDatabaseElement whose CRN matches the CRN passed to this method
     * @throws IOException thrown if CRN is not found
     */
    @Override
    public CourseDBElement get(int CRN) throws IOException {
        CourseDBElement tempCDBE = new CourseDBElement();
        tempCDBE.setCRN(CRN);
        int index = getHashIndex(tempCDBE);
        LinkedList<CourseDBElement> list = hashTable[index];

        // .stream() returns sequential stream of the linked list of CDB elements
        // .filter() filters all CDB elements whose CRN = the CRN passed to this method
        // .findAny() finds any CDB elements with the given CRN
        // .orElseThrow() throws an exception if no matching CDB element was found
        return list.stream()
                .filter(courseDBElement -> courseDBElement.getCRN() == CRN)
                .findAny()
                .orElseThrow(IOException::new);
    }

    /**
     * Returns the number of indexes in the array
     */
    @Override
    public int getTableSize() {
        return hashTable.length;
    }

    /**
     * Returns the index of the given CDB element
     * @param element - the element to compute
     * @return the element index
     */
    private int getHashIndex(CourseDBElement element) {
        int hashIndex = element.hashCode() % hashTable.length;
        if (hashIndex < 0) hashIndex += hashTable.length;
        return hashIndex;
    }
}
