package OOPs.Abstraction.Abstract;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("message.txt");

        try {
            System.out.println(digitsOnlyFileReader.readFile());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        System.out.println(digitsOnlyFileReader.getFilePath());
    }
}
