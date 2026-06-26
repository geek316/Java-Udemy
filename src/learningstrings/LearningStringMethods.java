package learningstrings;

public class LearningStringMethods {

    public static void main(String[] args) {

        String str = "Hello World"; // this is created in string pool

        System.out.println("Length of String is: " + str.length());
        System.out.println("To lowerCase: " + str.toLowerCase());
        System.out.println("To upperCase: " + str.toUpperCase());


        // variable str is not changed, but pointing to new object
        // new lowercase object will be created in heap.
        str = str.toLowerCase();
        System.out.println(str);


        str = "  welcome  ";
        System.out.println(" original str: " + str);
        System.out.println("trimmed: " + str.trim());

        str = "COMPLETED";
        System.out.println("substring: " + str.substring(6));
        System.out.println("substring: " + str.substring(4,7));
        System.out.println("replace: " + str.replace('E','e'));

        str = "www.test.com";
        System.out.println("Is this a www. URL: " + str.startsWith("www."));
        System.out.println("Is this a .com URL: " + str.endsWith(".com"));

        System.out.println("Chat at 6: " + str.charAt(6));




    }
}
