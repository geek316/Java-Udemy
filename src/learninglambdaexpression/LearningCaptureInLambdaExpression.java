package learninglambdaexpression;

@FunctionalInterface
interface MyMath {
    int addInteger(int a, int b);
}

class MathOperation {
    int z = 200;
    public void operation() {
        int x = 10;
        MyMath summation = (a, b) ->
        {
            int sum;
            sum = a + b;
            System.out.println("Sum of two number is: " + sum + " and x is: " + x + " and z is: " + z);
            return sum;
        };
        summation.addInteger(10, 20);
//        x = 20; // This is not allowed, method variable used inside lambda expression should be final of effectively final.
        System.out.println("x is: " + x);
        z = 50; // This is allowed, class variable used inside lambda expression can be modified inside the lambda expression or outside the lambda expression.
        System.out.println("z is: " + z);

    }
}



public class LearningCaptureInLambdaExpression {
    static void main() {
        MathOperation mathOperation = new MathOperation();
        mathOperation.operation();
    }
}
