import java.io.IOException;
import java.util.LinkedList;

/**
 * Class represents a hash table of linked lists of CourseDatabaseElements
 * @author Brandon Tenorio
 */
public class CourseDBStructure implements CourseDBStructureInterface {
    protected LinkedList<CourseDBElement>[] hashTable;

    /**
     * Parameterized constructor
     *
     * @param size the initial size of hashTable
     */
    @SuppressWarnings("unchecked")
    public CourseDBStructure(int size) {
        hashTable = new LinkedList[size];
    }

    /**
     * Parameterized constructor
     *
     * @param string there's like one instance of this class on the CourseDBStructureTests.java that takes in a String, so this constructor is for that. Other than that I don't know what this String object represents
     * @param size   initial size of hashTable
     */
    @SuppressWarnings("unchecked")
    public CourseDBStructure(String string, int size) {
        hashTable = new LinkedList[size];
    }


    /**
     * Checks to see if element is in the table before adding it. If element is not in the table, it adds it
     *
     * @param element the course element to be added
     */
    @Override
    public void add(CourseDBElement element) {
        int index = element.hashCode() % hashTable.length;

        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<>();
            hashTable[index].add(element);
        } else {
            if(element.compareTo(hashTable[index].element()) == 0) return;
            else hashTable[index].add(element);
        }
    }

    /**
     * Returns a CDBE whose CRN matches the given CRN.
     *
     * @param CRN the hashcode of CDBE
     * @return A CourseDatabaseElement whose CRN matches the CRN passed to this method
     * @throws IOException thrown if CRN is not found
     */
    @Override
    public CourseDBElement get(int CRN) throws IOException {
        String StringCRN = Integer.toString(CRN);
        int index = StringCRN.hashCode() % hashTable.length;

        if (hashTable[index] != null) {
            for (int i = 0; i < hashTable[index].size(); i++) {
                if (hashTable[index].get(i).getCRN() == CRN) return hashTable[index].get(i);
            }
        }
        throw new IOException();
    }

    /**
     * Returns the number of indexes in the array
     */
    @Override
    public int getTableSize() {
        return hashTable.length;
    }
}
