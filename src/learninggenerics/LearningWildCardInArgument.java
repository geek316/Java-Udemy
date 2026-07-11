package learninggenerics;

class StateClass<T> {
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

public class LearningWildCardInArgument {

    // super can be used instead of extends - it is lower bound
    // extends is upper bound
    static void fun(StateClass<? extends Number> sc) {
        sc.display();
    }

    static void main() {
        StateClass<Integer> sc = new StateClass<>();
        sc.append(10);
        sc.append(20);

        StateClass<String> sc2 = new StateClass<>();
        sc2.append("Hello");
        sc2.append("World");

        fun(sc);
//        fun(sc2);

    }
}
