package learninggenerics;

class Math<T> {

    T[] arr = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        arr[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }
}

// Arithmetic is extending Math and is not generic type, it is bounded by String
class Arithmatic extends Math<String> {
}

// Calculation is extending Math and is generic type
class Calculation<T> extends Math<T> {
}

public class LearningBoundsOnGenericsSubTypes {
    static void main() {

        Arithmatic arithmatic = new Arithmatic();
        arithmatic.append("Hello");
        arithmatic.append("Java");
        arithmatic.append("Bye");
        arithmatic.append("End");
        arithmatic.display();

        Calculation calculation = new Calculation<>();
        calculation.append(10);
        calculation.append(20);
        calculation.append("End");
        calculation.display();

        Calculation<Integer> calculation2 = new Calculation<>();
        calculation2.append(10);
        calculation2.append(20);
        calculation2.display();

    }
}
