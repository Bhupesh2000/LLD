package PracticeQuestions.Q02VendingMachineV2;

public class Product {
    private final String code;
    private final String name;
    private final int price;

    public Product(String code, String name, int price){
        if(code == null || code.isEmpty()) throw new IllegalArgumentException("code required");
        if(name == null || name.isEmpty()) throw new IllegalArgumentException("name required");
        if(price <= 0) throw new IllegalArgumentException("Price must be > 0");
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode()  {return code;}
    public String getName()  {return name;}
    public int getPrice()    {return price;}
}
