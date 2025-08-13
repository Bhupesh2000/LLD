package PracticeQuestions.Q01VendingMachine;

public class Main {
    public static void main(String[] args) {
        try{
            Product soda = new Product("Soda", 15);
            VendingMachine vm = new VendingMachine(soda, 2);
            vm.insertCoin(Coin.TEN);
            vm.insertCoin(Coin.TEN);
            Product p = vm.selectProduct();
            System.out.println("Dispensed: " + p.getName());  // "Soda"
            System.out.println(vm.returnChange());            // 5
            System.out.println(vm.getStockCount());           // 1
            // vm.selectProduct();                            // Insert 15 more.
            vm.insertCoin(Coin.TEN);
            vm.insertCoin(Coin.TEN);
            vm.insertCoin(Coin.TEN);
            vm.selectProduct();
            vm.selectProduct();                                // Please restock the machine.
        } catch (OutOfStockException e) {
            System.out.println("Please restock the machine.");
        } catch (InsufficientFundsException e) {
            System.out.println("Insert " + e.getShortFall() + " more.");
        }
    }
}
