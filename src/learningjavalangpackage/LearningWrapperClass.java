package learningjavalangpackage;

public class LearningWrapperClass {
    static void main() {

        Integer a = new Integer(10);
        Integer b = Integer.valueOf(10);
        Integer c = 10;

        Byte d = 15;
        Byte e = Byte.valueOf("10");
        byte f = Byte.valueOf("10");
        Byte g = Byte.valueOf(f);

        Short h = 10;
        Short i = Short.valueOf("10");
        short j = 10;
        Short k = Short.valueOf(j);

        Float l = 10.3f;
        Float m = Float.valueOf("10.3");
        float n = 10.3f;
        Float o = Float.valueOf(n);

        Double p = 10.3;
        Double q = Double.valueOf("10.3");
        double r = 10.3;
        Double s = Double.valueOf(r);

        Long t = 10L;
        Long u = Long.valueOf("10");
        long v = 10L;
        Long w = Long.valueOf(v);

        Character x = 'a';
        Character y = Character.valueOf('a');
        char z = 'a';
        Character a1 = Character.valueOf(z);

        Boolean b0 = true;
        Boolean b1 = Boolean.valueOf("true");
        boolean b2 = true;
        Boolean b3 = Boolean.valueOf(b2);


        float f1 = 10.3f;
        Float f2 = f1; // Autoboxing
        float f3 = f2; // Auto-Unboxing

        Integer intObj = 10;
        Integer intObj2 = Integer.valueOf("101010",2);
        int intVal = intObj2;
        System.out.println(intVal);

        Integer int001 = 100;
        System.out.println(Integer.reverse(int001));
        System.out.println(Integer.compare(10,20));
        System.out.println(Integer.compare(100,90));
        System.out.println(Integer.rotateLeft(100,2));
        System.out.println(Integer.rotateRight(100,2));


    }
}


