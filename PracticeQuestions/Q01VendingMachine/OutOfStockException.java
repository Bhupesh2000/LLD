package PracticeQuestions.Q01VendingMachine;

public class OutOfStockException extends RuntimeException{
    OutOfStockException(String message){
        super(message);
    }
}
