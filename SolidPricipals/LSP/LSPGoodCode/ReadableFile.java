package SolidPricipals.LSP.LSPGoodCode;

public class ReadableFile implements Readable{

    @Override
    public void read(){
        System.out.println("Reading from the file");
    }
}
