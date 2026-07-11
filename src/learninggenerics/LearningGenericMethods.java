package learninggenerics;

public class LearningGenericMethods {


    static <E> void display(E[] lst) {
        for (E e : lst) {
            System.out.println(e);
        }
    }

    @SafeVarargs
    static <E extends Character> void display(E... lst) {
        for (E e : lst) {
            System.out.println(e);
        }
    }

    static void main() {
        display(new String[]{"Hello", "World"});
        display(new Integer[]{1,2,3,4,5,6});
        display('a','b','c');
    }
}
