package learningoops.writingclass;

public class Cylinder {

    private double radius;
    private double height;

    public Cylinder() {
        this.radius = 1;
        this.height = 1;
    }

    public Cylinder(double radius, double height) {
        setRadius(radius);
        setHeight(height);
    }

    public Cylinder(double radius) {
        setRadius(radius);
        setHeight(1);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double lidArea() {
        return Math.PI * radius * radius;
    }
}

class CylinderMain {
    public static void main(String[] args) {

        Cylinder cylinderDefault = new Cylinder();
        System.out.println("Default");
        System.out.println("Volume: " + cylinderDefault.volume());
        System.out.println("Surface Area: " + cylinderDefault.surfaceArea());
        System.out.println("Lid Area: " + cylinderDefault.lidArea());

        Cylinder cylinderBig = new Cylinder(6, 10);
        System.out.println("Big");
        System.out.println("Volume: " + cylinderBig.volume());
        System.out.println("Surface Area: " + cylinderBig.surfaceArea());
        System.out.println("Lid Area: " + cylinderBig.lidArea());

        Cylinder cylinderOnlyRadius = new Cylinder(6);
        System.out.println("Only Radius");
        System.out.println("Volume: " + cylinderOnlyRadius.volume());
        System.out.println("Surface Area: " + cylinderOnlyRadius.surfaceArea());
        System.out.println("Lid Area: " + cylinderOnlyRadius.lidArea());

        Cylinder cylinderNegative = new Cylinder(-9, -1);
        System.out.println("Negative");
        System.out.println("Volume: " + cylinderNegative.volume());
        System.out.println("Surface Area: " + cylinderNegative.surfaceArea());
        System.out.println("Lid Area: " + cylinderNegative.lidArea());

    }
}
