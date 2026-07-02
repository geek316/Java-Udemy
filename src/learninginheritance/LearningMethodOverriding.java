package learninginheritance;

public class LearningMethodOverriding {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.speak();

        Animal animal = new Animal();
        animal.speak();

        Animal animal2 = new Dog(); // dynamic message dispatch - method of object is called
        animal2.speak();

    }
}

class Animal {
    public void speak() {
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal {
    public void speak() {
        System.out.println("Dog bark");
    }
}
