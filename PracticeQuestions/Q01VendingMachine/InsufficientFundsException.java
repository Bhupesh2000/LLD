package PracticeQuestions.Q01VendingMachine;

public class InsufficientFundsException extends RuntimeException{
    private final int shortFall;
    public InsufficientFundsException(String message, int shortFall){
        super(message);
        this.shortFall = shortFall;
    }
    public int getShortFall(){return shortFall;}
}
