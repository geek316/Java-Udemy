package learningmultithreading;

public class LearningYield {
    static void main() {
        Thread thor = new Thread(new Thor(), "Thor");
        Thread hulk = new Thread(new Hulk(), "Hulk");
        thor.start();
        hulk.start();
    }
}

class Thor extends Thread {
    public void run() {
        int count = 1;
        while (count <= 100) {
            System.out.println(count++ + "-Thor");
            Thread.yield();
        }
    }
}

class Hulk extends Thread {
    public void run() {
        int count = 1;
        while (count <= 100) {
            System.out.println(count++ + "-Hulk");
        }
    }
}
