package PracticeQuestions.Q02VendingMachineV2;

public class Main {
    public static void main(String[] args) {
        VendingMachineV2 VM2 = new VendingMachineV2();
        ItemSlot A1 = new ItemSlot(new Product("01", "Soda", 15), 2);
        ItemSlot B2 = new ItemSlot(new Product("02", "Chips", 10), 1);
        VM2.addSlot(A1);
        VM2.addSlot(B2);

        VM2.insertCoin(Coin.TEN);
        VM2.insertCoin(Coin.TEN);

        try{VM2.selectProduct("02");}
        catch(InsufficientFundsException E){
            System.out.println("ShortFall: " + E.getShortFall());
        }
        catch(OutOfStockException E){
            System.out.println("Out of stock");
        }

        System.out.println("Change returned: " + VM2.returnChange());

        System.out.println("Stock remaining for Soda: " + A1.getStockCount());
        System.out.println("Stock remaining for Chips: " + B2.getStockCount());

        try{VM2.selectProduct("02");}
        catch(InsufficientFundsException E){
            System.out.println("ShortFall: " + E.getShortFall());
        }
        catch(OutOfStockException E){
            System.out.println("Out of stock");
        }

        System.out.println("Change returned: " + VM2.returnChange());

        try{VM2.selectProduct("01");}
        catch(InsufficientFundsException E){
            System.out.println("ShortFall: " + E.getShortFall());
        }
        catch(OutOfStockException E){
            System.out.println("Out of stock");
        }
    }
}
