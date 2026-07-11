package learninglambdaexpression;

@FunctionalInterface
interface PrintValue {
    void print(String str);
}

class Reverse {

    public Reverse(String string) {
        System.out.println(string.toUpperCase());
    }

    public static void reverseString(String str) {
        StringBuilder string = new StringBuilder(str);
        System.out.println(string.reverse());
    }
}

public class LearningMethodReference {
    static void main() {

        PrintValue print = System.out::println;
        print.print("Hello");

        PrintValue reverse = Reverse::reverseString;
        reverse.print("Hello");

        PrintValue upperCase = Reverse::new;
        upperCase.print("Hello");

    }
}
