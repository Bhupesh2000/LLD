package SolidPricipals.LSP.LSPGoodCode;

public class Main {
    public static void main(String[] args) {
        ReadableFile readable = new ReadOnlyFile();
        readable.read();
        
        WritableFile writable = new WritableFile();
        writable.write();
        writable.read();

    }
}
