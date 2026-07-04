package learninginterface;

interface Vehicle {

    void start();

    void stop();

}

class Bus implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bus started");
    }

    @Override
    public void stop() {
        System.out.println("Bus stopped");
    }

    public void openDoors() {
        System.out.println("Bus doors opened");
    }
}

public class LearningInterface {
    public static void main(String[] args) {

        Vehicle vehicle = new Bus();
        vehicle.start();
        vehicle.stop();
//        vehicle.openDoors();
    }
}


