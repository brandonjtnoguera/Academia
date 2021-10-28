/**
 * Class represents a Course in the hashtable. A course has a unique CRN, an amount of credits, a room number, and an instructor associated with it
 * @author Brandon Tenorio
 */
public class CourseDBElement {
    String courseID;
    int CRN;
    int credits;
    String roomNumber;
    String instructorName;

    public CourseDBElement(String courseID, int CRN, int credits, String roomNumber, String instructorName) {
        this.courseID = courseID;
        this.CRN = CRN;
        this.credits = credits;
        this.roomNumber = roomNumber;
        this.instructorName = instructorName;
    }

    public CourseDBElement() {
        courseID = null;
        CRN = 0;
        credits = 0;
        roomNumber = null;
        instructorName = null;
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
