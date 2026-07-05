package learningpackages.mypack2;

import learningpackages.mypack1.Demo1;

public class Demo4 extends Demo1 {
    // Default variable a is not accessible
    // Private variable b is not accessible
    public void show() {
        System.out.println(c+d);
    }

    public static void main() {
        Demo4 obj = new Demo4();
        obj.show();
    }
}
