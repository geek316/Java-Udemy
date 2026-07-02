package learningabstractclass;

public class StudentChallengeClassShape {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 10);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
    }
}

abstract class Shape {

    abstract double area();

    abstract double perimeter();

}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}
