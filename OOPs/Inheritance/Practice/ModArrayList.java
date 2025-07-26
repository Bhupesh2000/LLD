package OOPs.Inheritance.Practice;

import java.util.ArrayList;

// ModArrayList is child class and ArrayList is parent class
// <D> so that arraylist can store any kind of data(just like a template), D is the reference to the data type
public class ModArrayList<D> extends ArrayList<D>{
    public D getUsingMod(Integer ind){
        int validIndex = Math.abs(ind % this.size()); // Math.abs to make index +ve
        return this.get(validIndex);
    }
}
