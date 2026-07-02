package learninginheritance;

public class LearningDynamicMethodDispatch {

    static void startVehicle(Vehicle vehicle) {
        vehicle.starts();
    }

    public static void main(String[] args) {


        // Dynamic Method Dispatch (Runtime Polymorphism):
        // Reference is SuperClass, object is SubClass.
        // Overridden methods are resolved at runtime based on the object type.

        startVehicle(new MotorCycle());
        startVehicle(new Helicopter());
        startVehicle(new Vehicle());

    }
}


class Vehicle {

    void starts() {
        System.out.println("Vehicle Starts");
    }

    void Stops() {
        System.out.println("Vehicle Stops");
    }
}

class MotorCycle extends Vehicle {

    @Override
    void starts() {
        System.out.println("MotorCycle Starts...braaaaap....");
    }

    void wheelie() {
        System.out.println("MotorCycle wheelie");
    }

}

class Helicopter extends Vehicle {

    @Override
    void starts() {
        System.out.println("Helicopter starts...dug dug dug...");
    }

    void fly() {
        System.out.println("Helicopter fly");
    }
}
