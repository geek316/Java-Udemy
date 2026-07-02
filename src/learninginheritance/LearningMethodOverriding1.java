package learninginheritance;

public class LearningMethodOverriding1 {
    public static void main(String[] args) {

        SmartTelevision smartTelevision = new SmartTelevision();
        smartTelevision.switchOn();
        smartTelevision.changeChannel();
        smartTelevision.browseInternet();
        smartTelevision.switchOff();

        System.out.println();

        Television television = new Television();
        television.switchOn();
        television.changeChannel();
        television.switchOff();

        System.out.println();

        Television newTelevision = new SmartTelevision();
        newTelevision.switchOn();
        newTelevision.changeChannel();
//        newTelevision.browseInternet(); // we cannot use browseInternet() method here as we are referencing the parent class
        newTelevision.switchOff();


    }
}

class Television {

    public void switchOn() {
        System.out.println("Television is switched on");
    }

    public void switchOff() {
        System.out.println("Television is switched off");
    }

    public void changeChannel() {
        System.out.println("Channel is changed manually");
    }

}

class SmartTelevision extends Television {

    @Override
    public void switchOn() {
        System.out.println("SmartTelevision is switched on");
    }

    @Override
    public void switchOff() {
        System.out.println("SmartTelevision is switched off");
    }

    @Override
    public void changeChannel() {
        System.out.println("Channel is changed via remote");
    }

    public void browseInternet() {
        System.out.println("Internet is browsed");
    }


}

