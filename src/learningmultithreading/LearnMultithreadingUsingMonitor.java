package learningmultithreading;

public class LearnMultithreadingUsingMonitor {
    static void main() {

        Thread t1 = new PrintTextV1("Hello World, this is java programming. ");
        Thread t2 = new PrintTextV2("Welcome and enjoy the journey!");
        t1.start();
        t2.start();
    }
}

class ShowString {
    static synchronized void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(str.charAt(i));
        }
    }
}

class PrintTextV1 extends Thread {
    String str;

    public PrintTextV1(String str) {
        this.str = str;
    }

    public void run() {
        ShowString.display(str);
    }
}

class PrintTextV2 extends Thread {
    String str;

    public PrintTextV2(String str) {
        this.str = str;
    }

    public void run() {
        ShowString.display(str);
    }
}
