package learninginheritance;

public class LearningMethodOverriding2 {
    public static void main(String[] args) {

        Car car = new Car();
        car.start();
        car.accelerate();
        car.changeGear();

        System.out.println();

        LuxuryCar luxuryCar = new LuxuryCar();
        luxuryCar.start();
        luxuryCar.accelerate();
        luxuryCar.changeGear();
        luxuryCar.openRoof();

    }
}

class Car {

    public void start() {
        System.out.println("Car is started");
    }

    public void accelerate() {
        System.out.println("Car is accelerated");
    }

    public void changeGear() {
        System.out.println("Gear is changed manually");
    }
}

class LuxuryCar extends Car {

    @Override
    public void changeGear() {
        System.out.println("Gear is changed automatically");
    }

    public void openRoof() {
        System.out.println("Roof is opened");
    }

}


