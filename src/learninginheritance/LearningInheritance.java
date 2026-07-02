package learninginheritance;

public class LearningInheritance {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder();
        cylinder.radius = 7;
        cylinder.height = 10;
        System.out.println("Volume: " + cylinder.volume());
        System.out.println("Surface Area: " + cylinder.area());

    }
}

class Circle {

    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

}

class Cylinder extends Circle {

    public double height;

    public double volume() {
        return area() * height;
    }

}
