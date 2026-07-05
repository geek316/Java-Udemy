package learningpackages.mypack1;

public class Demo1 {

    int a = 10;
    private int b = 20;
    protected int c = 30;
    public int d = 40;

    public void display() {
        System.out.println(a+b+c+d);
    }
}

class Demo2 {
    public static void main(String[] args) {

        Demo1 obj = new Demo1();
        obj.display();

        // Private variable b is not accessible
        System.out.println(obj.a + obj.c + obj.d);
    }
}

class Demo3 extends Demo1 {
    public static void main(String[] args) {
        Demo3 obj = new Demo3();
        obj.show();
    }
    // Private variable b is not accessible
    public void show() {
        System.out.println(a+c+d);
    }
}
