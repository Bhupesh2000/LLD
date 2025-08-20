package PracticeQuestions.Q02VendingMachineV2;

public class InsufficientFundsException extends RuntimeException{
    private final int shortFall;
    public InsufficientFundsException(String message, int shortFall){
        super(message);
        this.shortFall = shortFall;
    }
    public int getShortFall(){return shortFall;}
}
