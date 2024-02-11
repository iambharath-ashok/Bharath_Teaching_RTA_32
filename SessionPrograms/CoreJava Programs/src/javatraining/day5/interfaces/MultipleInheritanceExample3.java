package javatraining.day5.interfaces;

// Interface for a vehicle
interface Vehicle {
    void start();
    void stop();
}

// Interface for a vehicle with a speed property
interface SpeedyVehicle extends Vehicle {
    void increaseSpeed(int speed);
    void decreaseSpeed(int speed);
}

class A {

    public void aMethod() {

    }
}


class B extends A {}


// Class implementing both Vehicle and SpeedyVehicle interfaces
class Car implements SpeedyVehicle {
    private int currentSpeed;

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
        currentSpeed = 0;
    }

    @Override
    public void increaseSpeed(int speed) {
        currentSpeed += speed;
        System.out.println("Car speed increased to " + currentSpeed + " mph");
    }

    @Override
    public void decreaseSpeed(int speed) {
        currentSpeed -= speed;
        System.out.println("Car speed decreased to " + currentSpeed + " mph");
    }
}

public class MultipleInheritanceExample3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.increaseSpeed(50);
        car.decreaseSpeed(20);
        car.stop();
    }
}
