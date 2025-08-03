package DesignPatterns.CreationalDesignPatterns.FactoryDesignPattern.Solution;

public class TransportFactory {
    public static Transport createTransport(String type){ // static because we don't want to create object for TransportFactory
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("Unsupported transport request");
        }
    }
}
