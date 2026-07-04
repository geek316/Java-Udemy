package learninginterface;


class OuterClass {
    int x = 10;
    static String y = "Example of static inner class inside outer class";

    static class InnerClass {
        public void show() {
            System.out.println(y);
        }
    }
}


interface MyInterface {
    void show();
}

class MyClass {
    public void display() {
        new MyInterface() {
            public void show() {
                System.out.println("Example of Anonymous Inner Class with interface");
            }
        }.show();
    }
}


abstract class YourInterface {
    abstract public void show();
}

class YourClass {
    public void display() {
        new YourInterface() {
            @Override
            public void show() {
                System.out.println("Example of Anonymous Inner Class with abstract class");
            }
        }.show();
    }
}


class Outer {
    public void display() {
        class Inner {
            public void show() {
                System.out.println("Example of Local Inner Class");
            }
        }
        new Inner().show();

    }
}

public class LearningLocalAndStaticInnerClasses {
    static void main() {

        Outer o = new Outer();
        o.display();

        YourClass y = new YourClass();
        y.display();

        MyClass c = new MyClass();
        c.display();

        OuterClass.InnerClass ic = new OuterClass.InnerClass();
        ic.show();
    }
}
