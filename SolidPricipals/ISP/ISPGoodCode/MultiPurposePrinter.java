package SolidPricipals.ISP.ISPGoodCode;

public class MultiPurposePrinter implements Printer, Scanner, Copier{

    @Override
    public void print(Document doc){
        System.out.println("Printing doc");
    }

    @Override
    public void scan(Document doc){
        System.out.println("Scaning doc");
    }

    @Override 
    public void copy(Document doc){
        System.out.println("Copying doc");
    }
    
}
