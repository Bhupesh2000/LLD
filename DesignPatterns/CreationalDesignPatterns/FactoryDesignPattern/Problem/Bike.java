package DesignPatterns.CreationalDesignPatterns.FactoryDesignPattern.Problem;

public class Bike implements Transport{
    @Override
    public void deliver(){
        System.out.println("Delivered by bike");
    }
}
