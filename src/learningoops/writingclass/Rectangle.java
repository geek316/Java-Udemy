package learningoops.writingclass;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }

    public boolean isSquare() {
        return length == width;
    }
}

class RectangleMain {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Is Square: " + rectangle.isSquare());

        Rectangle rectangleOne = new Rectangle();
        System.out.println("Area: " + rectangleOne.area());
        System.out.println("Perimeter: " + rectangleOne.perimeter());
        System.out.println("Is Square: " + rectangleOne.isSquare());

        Rectangle rectangleNegative = new Rectangle(-1,-9);
        System.out.println("Area: " + rectangleNegative.area());
        System.out.println("Perimeter: " + rectangleNegative.perimeter());
        System.out.println("Is Square: " + rectangleNegative.isSquare());

    }
}
