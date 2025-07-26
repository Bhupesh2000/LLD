package OOPs.Inheritance.Practice;

public class Main {
    public static void main(String[] args) {
        ModArrayList<Integer> listy = new ModArrayList<>();
        listy.add(0);
        listy.add(10);
        listy.add(20);
        listy.add(30);

        System.out.println("Mod Element at index 1: " + listy.getUsingMod(1));
        System.out.println("Mod Element at index -2: " + listy.getUsingMod(-2));
        System.out.println("Mod Element at index 40: " + listy.getUsingMod(40));
    }
}
