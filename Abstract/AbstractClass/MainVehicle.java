package Abstract.AbstractClass;

abstract class Vehicle {
    Vehicle() {
        System.out.println("In vehicle");
    }
}

class Bike extends Vehicle {
    Bike() {
        System.out.println("In Bike");
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        Bike b = new Bike();
    }
}
