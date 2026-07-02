package learninginheritance;

class Parent {
    public Parent(int x) {
        System.out.println("Parent parameterised constructor called");
    }

    public Parent() {
        System.out.println("Parent non parameterised constructor called");
    }
}

class Child extends Parent {

    public Child(int x) {
        super(x);
        System.out.println("Child parameterised constructor called");
    }

    public Child() {
        System.out.println("Child non parameterised constructor called");
    }

    public Child(int x, int y) {
        super(x);
        System.out.println("Child two-parameterised constructor called");
    }
}

public class LearningParameterisedConstructor {
    public static void main(String[] args) {

        Child child = new Child();
        Child child2 = new Child(1);
        Child child3 = new Child(1, 2);

    }
}
