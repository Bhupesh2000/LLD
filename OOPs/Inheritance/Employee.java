package OOPs.Inheritance;

public class Employee {
    private String name;
    protected double salary; // kept as protected because this needs to accessed in subclass. Private won't be accessible in subclasses
    private Integer age;

    public Employee(String name, double salary, Integer age){
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public Integer getAge(){
        return this.age;
    }

    public void raiseSalary(double amount){
        this.salary = this.salary * 1.2;
    }
}
