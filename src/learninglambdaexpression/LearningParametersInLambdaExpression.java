package learninglambdaexpression;

@FunctionalInterface
interface MyLambdaEx {
    void addInteger(int a, int b);
}

public class LearningParametersInLambdaExpression {
    static void main() {

        MyLambdaEx lambda = (a, b) -> System.out.println("Sum of two number is: " + (a + b));
        lambda.addInteger(10, 20);
    }
}

