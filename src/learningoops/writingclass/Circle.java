package learningoops.writingclass;


public class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

class CircleMain {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.radius = 3.0;
        System.out.println("Area: " + circle.area());
        System.out.println("Circumference: " + circle.circumference());

    }
}
