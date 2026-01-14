package PracticeQuestions.Q02VendingMachineV2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachineV2 {
    private final Map<String, ItemSlot> slots = new HashMap<>();
    private int currentAmount;

    public void addSlot(ItemSlot slot){
        if(slot == null) throw new IllegalArgumentException("slot is required");
        String productCode = slot.getProduct().getCode();
        if(slots.containsKey(productCode)) throw new IllegalArgumentException("duplicate slot for " + productCode);
        slots.put(productCode, slot);
    }

    public void insertCoin(Coin coin){
        if(coin == null) throw new IllegalArgumentException("Unsupported coin value");
        currentAmount += coin.getValue();
    }

    public Product selectProduct(String code) {
        if(code == null || code.isEmpty()) throw new IllegalArgumentException("code is required");
        ItemSlot slot = slots.get(code);
        if(slot == null) throw new IllegalArgumentException("Product not found");
        if(slot.isEmpty()) throw new OutOfStockException("Out of stock");
        Product productDetails = slot.getProduct();
        int productPrice = productDetails.getPrice();
        if(this.currentAmount < productPrice) {
            int need = productPrice - this.currentAmount;
            throw new InsufficientFundsException("Insufficient amount. Need to pay " + need + " more", need);
        }
        slot.decrement();
        currentAmount -= productPrice;
        return productDetails;
    }

    public int returnChange() {
        int change = currentAmount;
        currentAmount = 0;
        return change;
    }

    public int getStock(String code) {
        if(code == null || code.isEmpty()) throw new IllegalArgumentException("code is required");
        ItemSlot slot = slots.get(code);
        if(slot == null) return 0;
        return slot.getStockCount();
    }

    public List<Product> listProducts() {
        List<Product> products = new ArrayList<>();
        for(ItemSlot slot : slots.values()){
            products.add(slot.getProduct());
        }
        return products;
    }

    public int getCurrentAmount() { return currentAmount; }

}
