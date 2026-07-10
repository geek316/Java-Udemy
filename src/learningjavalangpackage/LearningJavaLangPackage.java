package learningjavalangpackage;

public class LearningJavaLangPackage {
    static void main() {

        Object obj = new Object();
        Object obj2 = new Object();

        System.out.println("HashCode of first object: " + obj.hashCode());
        System.out.println("HashCode of second object: " + obj2.hashCode());

        System.out.println("String representation of first object: " + obj);
        System.out.println("String representation of second object: " + obj2);

        System.out.println("Class name of first object: " + obj.getClass().getName());
        System.out.println("Class name of second object: " + obj2.getClass().getName());

        System.out.println("Is first object equal to second object: " + obj.equals(obj2));

        System.out.println("Is first object same as second object: " + (obj == obj2));


        MyObject obj3 = new MyObject();
        System.out.println("String representation of obj3: " + obj3);
        System.out.println("HashCode of obj3: " + obj3.hashCode());

    }
}

class MyObject {

    @Override
    public String toString() {
        return "This is string of the class";
    }

    @Override
    public int hashCode() {
        return 1;
    }

}
