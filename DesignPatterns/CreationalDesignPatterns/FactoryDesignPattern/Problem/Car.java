package DesignPatterns.CreationalDesignPatterns.FactoryDesignPattern.Problem;

public class Car implements Transport{
    @Override
    public void deliver(){
        System.out.println("Delivered by car");
    }
}
