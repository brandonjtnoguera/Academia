public class InvalidCRNException extends RuntimeException{
    public InvalidCRNException(){
        this("The CRN for this course must be a unique positive number of 5 digits");
    }

    public InvalidCRNException(String msg){
        super(msg);
    }
}
