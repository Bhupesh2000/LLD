package SolidPricipals.LSP.LSPBadCode;

public class ReadOnlyFile extends File{

    @Override
    public void write(){
        throw new UnsupportedOperationException("Can't write to read only file");
    }
}

// Needs to override write() method
// so this is a bad code and a violation of LSP