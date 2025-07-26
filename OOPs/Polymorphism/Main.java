package OOPs.Polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        OddArrayList oddListy = new OddArrayList(1, 2, 3, 4, 7, -13, -16);
        System.out.println(oddListy); // 1 3 7 -13

        ArrayList<Integer> listy = new ArrayList<>();
        listy.add(1);
        listy.add(2);
        listy.add(3);
        listy.add(4);
        listy.add(7);
        listy.add(-13);
        listy.add(-16);

        System.out.println(listy); // 1 2 3 4 7 -13 -16

        Calculator calc = new Calculator();
        calc.add(1, 2);        // Calls int version
        calc.add(1.5, 2.0);    // Calls double version
        
    }
}
