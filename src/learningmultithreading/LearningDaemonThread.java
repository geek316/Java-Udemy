package learningmultithreading;

public class LearningDaemonThread {
    static void main() {
        Thread thread = new Thread(new GodlyThread(), "GodlyThread");
        thread.setDaemon(true);
        thread.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


class GodlyThread extends Thread {
    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++ + " GodlyThread");
        }
    }
}
