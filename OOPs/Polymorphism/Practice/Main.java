package OOPs.Polymorphism.Practice;

public class Main {
    public static void main(String[] args) {
        Contact contactOne = new Contact("Sally", new PhoneNumber("9087654321"));
        Contact contactTwo = new Contact("Maggie", new PhoneNumber("129087654321"), "Maggie@gmail.com");
        Contact contactThree = new Contact("John", new PhoneNumber(12, "9087654321"));
        Contact contactFour = new Contact("David", "David@gmail.com");

        System.out.println(contactOne); // overriden in the class using toString
        System.out.println(contactTwo); // if not overriden it would have printed the address of the object
        System.out.println(contactThree);
        System.out.println(contactFour);
    }
}
