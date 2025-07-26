package OOPs.Inheritance;

// will have all the attributes and methods of Employee class
public class Analyst extends Employee {
    public Analyst(String name, double salary, Integer age){
        // this.name = name;
        // this.salary = salary;
        // this.age = age;
        super(name, salary, age);
    }

    public double getAnnualBonus(){
        return super.salary * 0.5; // this.salary can also be used
    }
}
