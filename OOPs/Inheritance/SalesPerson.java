package OOPs.Inheritance;

public class SalesPerson extends Employee{

    private double commissionPercentage;

    public SalesPerson(String name, double salary, Integer age, double commissionPercentage){
        // this.name = name;
        // this.salary = salary;
        // this.age = age;
        super(name, salary, age);
        this.commissionPercentage = commissionPercentage;
    }

    public double getCommissionPercentage(){
        return this.commissionPercentage;
    }

    public void raiseCommissionPercentage(){
        if(this.commissionPercentage < 0.3){
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }
}
