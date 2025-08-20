package PracticeQuestions.Q02VendingMachineV2;

public class ItemSlot {
    private final Product product;
    private int stockCount;

    public ItemSlot(Product product, int initialStockCount){
        if(product == null) throw new IllegalArgumentException("product is required");
        if(initialStockCount < 0) throw new IllegalArgumentException("stock count must be > 0");
        this.product = product;
        this.stockCount = initialStockCount;
    }

    public Product getProduct(){return product;}
    public int getStockCount(){return stockCount;}
    public boolean isEmpty(){return stockCount == 0;}
    public void decrement(){
        if(stockCount == 0) throw new IllegalStateException("slot empty");
        stockCount --;
    }
}
