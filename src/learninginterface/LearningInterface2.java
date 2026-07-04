package learninginterface;

interface ICamera {
    void click();

    void record();
}

interface IMusicPlayer {
    void play();

    void pause();

    void stop();
}

class Phone {

    void call() {
        System.out.println("Phone is calling");
    }

    void message() {
        System.out.println("Phone is messaging");
    }
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {

    void videoCall() {
        System.out.println("SmartPhone is video calling");
    }

    @Override
    public void click() {
        System.out.println("SmartPhone is clicking");
    }

    @Override
    public void record() {
        System.out.println("SmartPhone is recording");
    }

    @Override
    public void play() {
        System.out.println("SmartPhone is playing");
    }

    @Override
    public void pause() {
        System.out.println("SmartPhone is pausing");
    }

    @Override
    public void stop() {
        System.out.println("SmartPhone is stopping");
    }


}

public class LearningInterface2 {
    public static void main(String[] args) {

        SmartPhone s = new SmartPhone();
        Phone p = s;
        ICamera c = s;
        IMusicPlayer m = s;

        p.call();
        c.click();
        m.play();


    }
}
