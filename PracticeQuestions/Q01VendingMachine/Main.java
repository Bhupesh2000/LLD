package PracticeQuestions.Q01VendingMachine;

public class Main {
    public static void main(String[] args) {
        Product soda = new Product("Soda", 15);
        VendingMachine vm = new VendingMachine(soda, 2);
        vm.insertCoin(Coin.TEN);
        vm.insertCoin(Coin.TEN);
        System.out.println(vm.selectProduct().getName()); // "Soda"
        System.out.println(vm.returnChange());            // 5
        System.out.println(vm.getStockCount());           // 1
    }
}
