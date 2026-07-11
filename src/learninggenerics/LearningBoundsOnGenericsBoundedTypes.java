package learninggenerics;

class Mathematics<T extends Number> {
    Object[] a = new Object[10];
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

public class LearningBoundsOnGenericsBoundedTypes {
    static void main() {

        Mathematics<Integer> mathematics = new Mathematics<>();
        mathematics.append(10);
        mathematics.append(20);
        mathematics.append(30);
        mathematics.display();

        Mathematics<Double> mathematics2 = new Mathematics<>();
        mathematics2.append(10.0);
        mathematics2.append(20.0);
        mathematics2.append(30.0);
        mathematics2.display();

        Mathematics<Float> mathematics3 = new Mathematics<>();
        mathematics3.append(10.0f);
        mathematics3.append(20.0f);
        mathematics3.append(30.0f);
        mathematics3.display();
    }
}
