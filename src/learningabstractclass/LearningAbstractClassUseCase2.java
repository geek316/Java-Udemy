package learningabstractclass;

public class LearningAbstractClassUseCase2 {
    public static void main(String[] args) {
        KFC kfc = new KalingaFriedChicken();
        kfc.menu();
        kfc.order();
        kfc.payment();
        kfc.pickup();
        kfc.delivery();
        kfc.billing();
        kfc.offer();
    }
}

abstract class KFC {
    abstract void menu();
    abstract void order();
    abstract void payment();
    abstract void pickup();
    abstract void delivery();
    abstract void billing();
    abstract void offer();
}

class KalingaFriedChicken extends KFC {

    @Override
    void menu() {
        System.out.println("Kalinga Fried Chicken Menu, Ashok's Fav KFC. I'm loving it!!");
    }

    @Override
    void order() {
        System.out.println("Order your KFC");
    }

    @Override
    void payment() {
        System.out.println("Only cards accepted");
    }

    @Override
    void pickup() {
        System.out.println("Pickup available");
    }

    @Override
    void delivery() {
        System.out.println("Home delivery available");
    }

    @Override
    void billing() {
        System.out.println("Food is free if you did not get the bill");
    }

    @Override
    void offer() {
        System.out.println("30% off on every purchase made above 1000");
    }
}

