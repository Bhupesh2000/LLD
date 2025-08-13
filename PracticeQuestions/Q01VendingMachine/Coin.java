package PracticeQuestions.Q01VendingMachine;

public enum Coin {
    ONE(1), FIVE(5), TEN(10);
    private final int val;
    Coin(int val){
        this.val = val;
    }
    public int getValue(){
        return val;
    }
}
