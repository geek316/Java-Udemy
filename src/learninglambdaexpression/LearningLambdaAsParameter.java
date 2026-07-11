package learninglambdaexpression;

@FunctionalInterface
interface MyLamb {
    void display();
}

class UseLambda {
    public void callLambda(MyLamb lambda) {
        lambda.display();
    }
}

public class LearningLambdaAsParameter {
    static void main() {

        UseLambda useLambda = new UseLambda();
        useLambda.callLambda(() -> System.out.println("Hello"));

    }
}
