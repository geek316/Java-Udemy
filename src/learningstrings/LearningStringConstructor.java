package learningstrings;

public class LearningStringConstructor {
    public static void main(String[] args) {

        // creating string object

        String str = "Java Program"; // this will create one object on string constant pool.
        System.out.println(str);

        char[] ch = {'J', 'a', 'v', 'a', ' ', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
        String str2 = new String(ch);
        System.out.println(str2);

        byte[] byt = {65, 66, 67, 68};
        String str3 = new String(byt);
        System.out.println(str3);

        String str4 = new String("Hello World"); // this will create two objects, one on heap memory and one on string constant pool.
        System.out.println(str4);


    }
}
