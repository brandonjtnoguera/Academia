public class InvalidRoomNumberException extends RuntimeException{
    public InvalidRoomNumberException(){
        this("The room number you entered is invalid. Expected format is XX123 for in-person courses, and Distance-Learning for online courses");
    }

    public InvalidRoomNumberException(String msg){
        super(msg);
    }
}
