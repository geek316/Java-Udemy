package learningstrings;

public class LearningPrintStatement {

    public static void main(String[] args) {

        int x = 10, y = 20;

        System.out.println(x+y+" Sum");
        System.out.println("Sum "+x+y);
        System.out.println("Sum of "+x+" and "+y+" is: " + (x+y));

        System.out.printf("Hello %1$d %1$d %2$d", x, y);

    }
}
