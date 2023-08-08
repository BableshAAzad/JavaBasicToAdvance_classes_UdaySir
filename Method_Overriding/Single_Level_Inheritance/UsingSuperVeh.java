package Method_Overriding.Single_Level_Inheritance;

public class UsingSuperVeh {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        super.start();
        System.out.println("Car Started");
        super.start();
    }
}
