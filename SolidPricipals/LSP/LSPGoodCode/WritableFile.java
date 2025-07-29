package SolidPricipals.LSP.LSPGoodCode;

public class WritableFile extends ReadableFile implements Writable{
    
    @Override
    public void write(){
        System.out.println("Writing into the file");
    }
}
