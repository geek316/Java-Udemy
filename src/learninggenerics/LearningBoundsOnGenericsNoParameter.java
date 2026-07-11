package learninggenerics;

class MyGenArray<T> {

    T[] a = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        a[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(a[i]);
        }
    }
}

public class LearningBoundsOnGenericsNoParameter {
    static void main() {

        MyGenArray arr = new MyGenArray<>();
        arr.append("Hello");
        arr.append("Java");
        arr.append("Bye");
        arr.append(10);
        arr.display();

    }
}
