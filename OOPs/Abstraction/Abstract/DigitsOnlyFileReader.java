package OOPs.Abstraction.Abstract;

// Receives a numerical secret message placed in contents of a file
// To retrieve just look at the number and filter out all other letters and symbols
public class DigitsOnlyFileReader extends AbstractFileReader{
    public DigitsOnlyFileReader(String filePath){
        super(filePath);
    }

    @Override
    protected String parseLine(String line){
        return line.replaceAll("[^0-9]", ""); // replaces all chars except 0 - 9 with ""
    }
}
