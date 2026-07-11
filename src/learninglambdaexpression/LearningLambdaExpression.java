package learninglambdaexpression;

@FunctionalInterface
interface MyLambda {
    void displayLambda();
}

class MyClass implements MyLambda {
    public void displayLambda() {
        System.out.println("Display Lambda");
    }
}

public class LearningLambdaExpression {
    static void main() {

        MyLambda myClass = new MyClass();
        myClass.displayLambda();

        MyLambda myLambda = () -> System.out.println("Display Lambda Expression");
        myLambda.displayLambda();

    }
}
