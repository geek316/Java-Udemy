package learningstaticandfinal;

public class LearningStatic {
    static void main() {

        Car lightningMcQueen = new Car("Lightning McQueen", "Red", "2021");
        System.out.println(lightningMcQueen.toString());
        System.out.println("On Road Price: " + Car.onRoadPrice("delhi"));

        Car bumbleBee = new Car("BumbleBee", "Yellow", "2024");
        System.out.println(bumbleBee.toString());
        System.out.println("On Road Price: " + Car.onRoadPrice("mumbai"));

        Car optimusPrime = new Car("Optimus Prime", "Blue", "1999");
        System.out.println(optimusPrime.toString());
        System.out.println("On Road Price: " + Car.onRoadPrice("bangalore"));

    }
}

class Car {
    private static final long price = 10;
    private final String name;
    private String color, model;

    public Car(String name, String color, String model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    public static long getPrice() {
        return price;
    }

    static double onRoadPrice(String city) {

        return switch (city) {
            case "delhi" -> price + 10;
            case "mumbai" -> price + 20;
            case "bangalore" -> price + 30;
            default -> price;
        };
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "\nName: " + getName() + "\nColor: " + getColor() + "\nModel: " + getModel() + "\nPrice: " + getPrice();
    }
}
