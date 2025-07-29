package SolidPricipals.ISP.ISPGoodCode;

public class SimplePrinter implements Printer{

    @Override
    public void print(Document doc){
        System.out.println("Printing doc");
    }
    
}
