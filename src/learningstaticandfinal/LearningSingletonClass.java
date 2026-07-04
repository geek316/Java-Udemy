package learningstaticandfinal;

import static java.util.Objects.isNull;

public class LearningSingletonClass {
    static void main() {
        CoffeeMachine coffee1 = CoffeeMachine.getInstance();
        CoffeeMachine coffee2 = CoffeeMachine.getInstance();
        CoffeeMachine coffee3 = CoffeeMachine.getInstance();

        System.out.println(coffee1 + " " + coffee2 + " " + coffee3);
        if (coffee1 == coffee2 && coffee2 == coffee3)
            System.out.println("Same Object");
        else
            System.out.println("Different Objects");

    }
}

class CoffeeMachine {

    private static CoffeeMachine instance = null;
    private float coffeeQty;
    private float waterQty;
    private float milkQty;

    private CoffeeMachine() {
        this.coffeeQty = 10;
        this.waterQty = 10;
        this.milkQty = 10;
    }

    static public CoffeeMachine getInstance() {
        if (isNull(instance))
            instance = new CoffeeMachine();
        return instance;
    }

    public String toString() {
        return "CoffeeMachine";
    }
}
