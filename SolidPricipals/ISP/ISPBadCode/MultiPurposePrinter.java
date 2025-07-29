package SolidPricipals.ISP.ISPBadCode;

public class MultiPurposePrinter implements Machine{

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
