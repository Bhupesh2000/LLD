package SolidPricipals.ISP.ISPBadCode;

// This is a simple printer and support only printing
public class SimplePrinter implements Machine{
    
    @Override
    public void print(Document doc){
        System.out.println("Printing doc");
    }

    @Override
    public void scan(Document doc){
        throw new UnsupportedOperationException("Scanning not supported");
    }

    @Override
    public void copy(Document doc){
        throw new UnsupportedOperationException("Copying not supported");
    }
}

// This is violation of ISP
// This class is burdened by methods that are not supported. This is a bad design