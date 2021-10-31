/**
 * Class represents a Course in the hashtable. A course has a unique CRN, a classID (such as CMSC204), an amount of credits, a room number, and an instructor associated with it
 * Implements Comparable in order to compare two different courses
 * @author Brandon Tenorio
 */
public class CourseDBElement implements Comparable{
    String courseID;
    int CRN;
    int credits;
    String roomNumber;
    String instructorName;

    public CourseDBElement(String courseID, int CRN, int credits, String roomNumber, String instructorName) throws InvalidCreditAmountException, InvalidCRNException{
        if (credits < 1 || credits > 4) throw new InvalidCreditAmountException();
        if(CRN < 0 || String.valueOf(CRN).length() > 5) throw new InvalidCRNException();
        this.courseID = courseID;
        this.CRN = CRN;
        this.credits = credits;
        this.roomNumber = roomNumber;
        this.instructorName = instructorName;
    }

    public CourseDBElement(){
        courseID = roomNumber = instructorName = null;
        CRN = credits = 0;
    }

    /**
     * Compares to elements to check if they're equal
     * @param element element to be compared to
     * @return 0 if they're equal, -1 if they're not
     */
    @Override
    public int compareTo(CourseDBElement element) {
        if(getCRN() == element.getCRN()) return 0;
        else return -1;
    }

    @Override
    public int hashCode() {
        String code = Integer.toString(CRN);
        return code.hashCode();
    }

    @Override
    public String toString() {
        return "\nCourse:" + courseID + " CRN:" + CRN + " Credits:" + credits + " Instructor:"
                + instructorName + " Room:" + roomNumber;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public int getCRN() {
        return CRN;
    }

    public void setCRN(int CRN) {
        this.CRN = CRN;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
