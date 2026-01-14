package PracticeQuestions.Q02VendingMachineV2;

public class OutOfStockException extends RuntimeException{
    public OutOfStockException(String message){
        super(message);    
    }
}
