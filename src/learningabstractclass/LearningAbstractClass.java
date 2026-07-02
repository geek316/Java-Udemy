package learningabstractclass;

public class LearningAbstractClass {
    public static void main(String[] args) {
        Super superHero = new Hero();
        superHero.superMan();
        superHero.superWoman();
        superHero.superHero();
    }
}

abstract class Super {

    void superMan() {
        System.out.println("Super Man");
    }

    void superWoman() {
        System.out.println("Super Woman");
    }

    abstract void superHero();

}

class Hero extends Super {

    @Override
    void superHero() {
        System.out.println("Some super hero level shit...!!");
    }
}



