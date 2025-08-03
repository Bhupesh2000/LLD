package DesignPatterns.CreationalDesignPatterns.FactoryDesignPattern.Problem;

public class TransportService {
    public static void main(String[] args) {
        // Direct create objects
        Transport car = new Car(); // Tight coupling
        Transport bike = new Bike();

        car.deliver();
        bike.deliver();

    }
}
