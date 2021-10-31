public class InvalidCreditAmountException extends RuntimeException{
    public InvalidCreditAmountException(){
        this("The amount of credits for this course must be between 1 and 4 (inclusive). Please re-enter the information with the proper amount of credits");
    }

    public InvalidCreditAmountException(String msg){
        super(msg);
    }
}
