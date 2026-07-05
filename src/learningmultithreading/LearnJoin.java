package learningmultithreading;

public class LearnJoin {
    static void main() {
        Thread thread = new Thread(new Incredibles(), "Incredibles");
        thread.setDaemon(true);
        thread.start();
        Thread mainThread = Thread.currentThread();
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Incredibles extends Thread {
    public void run() {
        int count = 1;
        while (count <= 100) {
            System.out.println(count++ + " Incredibles");
        }
    }
}
