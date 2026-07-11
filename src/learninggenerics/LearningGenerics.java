package learninggenerics;

public class LearningGenerics {
    static void main() {

        Object obj = new String("Hello");
//        String str = obj; // this is not allowed.
//        obj = new Integer(10); // this will throw runtime exception.
        String str = (String) obj;

        Object[] obj1 = new Object[3];
        obj1[0] = "Hello";
        obj1[1] = 10;
        obj1[2] = "Bye";

        for (Object obj2 : obj1) {
//            str = (String) obj2; // this will throw runtime exception.
            System.out.println(obj2);
        }

    }
}
