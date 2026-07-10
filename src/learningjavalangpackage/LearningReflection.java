package learningjavalangpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class LearningReflection {
    static void main() {

        Class c = Demo.class;
        System.out.println(c.getName());

        Demo d = new Demo("Summi", 22);
        Class c2 = d.getClass();
        System.out.println(c2.getName());

        Field[] declaredFields = c.getDeclaredFields();

        for (Field field : declaredFields) {
            System.out.println(field.getType().getName() + " : " + field.getName());
        }

        Constructor[] constructors = c.getConstructors();

        for (Constructor constructor : constructors) {
            System.out.println(constructor.getClass().getName());
        }

        Method[] methods = c.getMethods();

        for (Method method : methods) {
            System.out.println(method.getName() + " : " + method.getReturnType().getName());
        }

        Parameter[] parameters = methods[0].getParameters();

        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }


    }
}

class Demo {
    String name;
    int age;

    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display(int name) {
        System.out.println("Display method");
    }
}
