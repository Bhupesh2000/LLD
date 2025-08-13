package PracticeQuestions.Q01VendingMachine;

public class VendingMachine {
    private final Product product; // kept final because only a single product
    private int stockCount;
    private int currentAmount;

    public VendingMachine(Product product, int initialStockCount){
        if (product == null) throw new IllegalArgumentException("product cannot be null");
        if (initialStockCount < 0) throw new IllegalArgumentException("initialStockCount cannot be negative");
        this.product = product;
        this.stockCount = initialStockCount;
        this.currentAmount = 0;
    }

    public void insertCoin(Coin coin){
        if(coin == null) throw new IllegalArgumentException("Unsupported coin value");
        currentAmount += coin.getValue();
    }

    public Product selectProduct(){
        int price = product.getPrice();
        if(stockCount == 0) throw new OutOfStockException("Out of stock");
        int need = price - currentAmount;
        if(currentAmount < price) throw new InsufficientFundsException("Insufficient amount. Need to pay " + need + " more", need);
        stockCount --;
        currentAmount -= price;
        return product;
    }
    public int returnChange(){
        int returnAmount = currentAmount;
        currentAmount = 0;
        return returnAmount;
    }

    public int getCurrentAmount(){return currentAmount;}
    public int getStockCount(){return stockCount;}
}
