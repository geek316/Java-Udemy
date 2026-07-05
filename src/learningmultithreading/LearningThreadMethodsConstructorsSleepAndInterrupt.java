package learningmultithreading;

public class LearningThreadMethodsConstructorsSleepAndInterrupt {
    static void main() {

        Thread thread = new Thread("Main-Thread");
        Thread thread2 = new Thread(new Speed(), "Speed-Thread");
        Thread thread3 = new Thread(new Power(), "Power-Thread");

        System.out.println("Name of first thread: " + thread.getName());
        System.out.println("Name of second thread: " + thread2.getName());
        System.out.println("Name of third thread: " + thread3.getName());

        System.out.println("\nId of thread: " + thread.getId());

        System.out.println("\nPriority of thread: " + thread.getPriority());
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority of thread changed: " + thread.getPriority());
        thread.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Priority of thread changed: " + thread.getPriority());
        thread.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Priority of thread changed: " + thread.getPriority());
        thread.setPriority(Thread.NORM_PRIORITY+2 );
        System.out.println("Priority of thread changed: " + thread.getPriority());

        try {
            System.out.println("\nState of thread: " + thread.getState());
            thread.start();
            System.out.println("State of thread: " + thread.getState());
            thread.sleep(1000);
            System.out.println("State of thread: " + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Speed implements Runnable {
    public void run() {
    }
}

class Power extends Thread {
    public void run() {
    }
}
