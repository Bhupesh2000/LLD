package OOPs.Abstraction.Abstract;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

// Read a file in several different ways
// Some hold secret messages, some have info we want to redact
// Retrieve the content of the file in different ways
// This class will have basic ops for interacting with the file and retrieving the file's content
// classes with abstract method must be denoted as abstract
// No instance can be instantiated for abstract class
public abstract class AbstractFileReader {
    private final Path filePath; // final because once set, don't change it

    protected AbstractFileReader(String filePath){
        this.filePath = Path.of(filePath); // Path.of() converts to Path object
    }

    public String getFilePath(){
        return this.filePath.toString();
    }

    // this will read the input and turn the output into a list of strings
    // Iterate through the lines of the filepath, parse it, collect the parsed results into a list and return it
    public List<String> readFile() throws IOException{
        return Files.lines(filePath).map(this::parseLine).collect(Collectors.toList());
    }

    // this should not be implemented in the base class as this needs to parsed differently for each new class
    // all the subclasses will override this method with different implementations
    // base parsing will be no parsing at all
    // to force subclasses to implement this method, this can be done by adding keyword abstract
    protected abstract String parseLine(String line);
}
