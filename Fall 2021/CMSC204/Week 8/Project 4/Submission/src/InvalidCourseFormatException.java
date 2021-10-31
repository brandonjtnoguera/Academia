/**
 * @author Brandon Tenorio
 */
public class InvalidCourseFormatException extends RuntimeException{
    public InvalidCourseFormatException(){
        this("The course format entered is invalid. It must be in the form of: courseID, CRN, credits, room number, and instructor name");
    }
    public InvalidCourseFormatException(String msg){
        super(msg);
    }
}
