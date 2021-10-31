public class InvalidCourseIDException extends RuntimeException{
    public InvalidCourseIDException(){
        this("The courseID entered is invalid. The format for a course ID should be XXXX123. Only Computer Science courses are supported for now");
    }

    public InvalidCourseIDException(String msg){
        super(msg);
    }
}
