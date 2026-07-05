package learningmultithreading;

public class LearningMultithreadingViaThreadClass {
    static void main() {
        MyThread thread = new MyThread();
        thread.start();
        Show.show("World");
    }
}


class MyThread extends Thread {
    public void run() {
        Show.show("Hello");
    }
}

class Show {
    static void show(String str) {
        int i = 1;
        while (true) {
            System.out.println(i + " - " + str);
            i++;
        }
    }
}


