package learningmultithreading;

public class LearnMultithreadingViaRunnableInterface {
    static void main() {
        MyThread2 thread2 = new MyThread2();
        Thread thread = new Thread(thread2);
        thread.start();
        Show2.show("World");
    }
}


class MyThread2 implements Runnable {
    public void run() {
        Show2.show("Hello");
    }
}

class Show2 {
    static void show(String str) {
        int i = 1;
        while (true) {
            System.out.println(i + " - " + str);
            i++;
        }
    }
}
