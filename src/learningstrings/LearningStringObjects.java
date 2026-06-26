package learningstrings;

public class LearningStringObjects {

    public static void main(String[] args) {


        String str1 = "String Literal";

        String str2 = new String("Saved in Heap");

        char[] ch = { 'c', 'h', 'a', 'r', 'a', 'c', 't', 'e', 'r', 's'};
        String str3 = new String(ch);

        byte[] byt = {65, 66, 67, 68};
        String str4 = new String(byt);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);


        String str5 = "Java";
        String str6 = "Java";
        String str7 = "java";

        System.out.print("Are the two reference equal: ");
        System.out.println(str5 == str6);

        System.out.print("Are the two reference equal: ");
        System.out.println(str6 == str7);

        String str8 = new String("Java");
        System.out.print("Are the two reference equal: ");
        System.out.println(str5 == str8);

    }
}
