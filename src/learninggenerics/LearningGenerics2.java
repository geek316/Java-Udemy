package learninggenerics;

public class LearningGenerics2<T> {

    Object[] data = new Object[4];

    static void main() {

        LearningGenerics2<String> genericsString = new LearningGenerics2<>();
        genericsString.data[0] = "Hello";
        genericsString.data[1] = "Java";
        genericsString.data[2] = "Bye";

        for (Object obj : genericsString.data) {
            String str = (String) obj;
            System.out.println(str);
        }
    }
}
