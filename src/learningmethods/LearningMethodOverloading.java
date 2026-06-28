package learningmethods;

public class LearningMethodOverloading {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;
        float x = 10.5f, y = 20.5f;

        System.out.println("Max of two number is : " + max(a,b));
        System.out.println("Max of two number is : " + max(x,y));
        System.out.println("Max of three number is : " + max(a,b,c));

    }

    static int max(int a, int b) {
        return Math.max(a,b);
    }

    static float max(float a, float b) {
        return Math.max(a,b);
    }

    static int max(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }

}
