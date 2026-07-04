package learningstaticandfinal;

public class LearningStaticBlock {

    static void main() {
        Coffee coffee = new Coffee();
        System.out.println("what else do you want?");

    }
}

class Coffee {

    private static String coffee;

    static {
        System.out.println("Coffee is brewing");
        coffee = "Acha wala Coffee";
    }

    static {
        System.out.println(coffee + " is ready");
    }
}