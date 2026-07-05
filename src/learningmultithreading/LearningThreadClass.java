package learningmultithreading;

public class LearningThreadClass {
    static void main() {

        World world = new World();
        world.start();

    }
}


class World extends Thread {

    public void run() {
        for(int i=0; i<1; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getState());
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getId());
                System.out.println(Thread.currentThread().isDaemon());
                System.out.println(Thread.currentThread().isAlive());
                System.out.println(Thread.currentThread().isInterrupted());
                System.out.println(Thread.currentThread().getThreadGroup());
                System.out.println(Thread.activeCount());
                System.out.println(Thread.currentThread().getStackTrace());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
