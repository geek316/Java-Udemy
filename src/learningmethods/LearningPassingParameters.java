package learningmethods;

public class LearningPassingParameters {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Initial value of x: " + x);
        update(x);
        System.out.println("Final value of x: " + x);
    }

    static int update(int x) {
        x = 20;
        System.out.println("Inside update method: " + x);
        return x;
    }
}
