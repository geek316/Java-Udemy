package learninggenerics;

class MyGen2Array<T, K> {

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

public class LearningBoundsOnGenericsMultipleParameter {
    static void main() {
        MyGen2Array<String, Integer> arr = new MyGen2Array<>(); // multiple parameterized generics
        arr.append("Hello");
        arr.append("Java");
        arr.append("Bye");
        arr.display();
    }
}
