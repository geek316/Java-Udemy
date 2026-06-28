package learningmethods;

public class StudentChallengeMethodOverloadingCalculateArea {
    public static void main(String[] args) {

        int length = 10;
        int breadth = 20;
        int radius = 15;

        System.out.println("Area of square is : " + calculateArea(length,length));
        System.out.println("Area of rectangle is : " + calculateArea(length,breadth));
        System.out.println("Area of circle is : " + calculateArea(radius));

    }

    static float calculateArea(int length, int breadth) {
        return length * breadth;
    }

    static float calculateArea(int radius) {
        return (float) (Math.PI * radius * radius);
    }
}
