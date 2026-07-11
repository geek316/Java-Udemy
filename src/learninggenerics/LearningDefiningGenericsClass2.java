package learninggenerics;

class MyArray<T> {
    T[] a = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        a[length++] = v;
    }

    public void display() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

public class LearningDefiningGenericsClass2 {
    static void main() {

        MyArray<String> arr = new MyArray<>();
        arr.append("Say");
        arr.append("Tell");
        arr.append("Bolo");
        arr.display();

    }
}
