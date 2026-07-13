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

        str = "COBOL";
        System.out.println("Index of O: " + str.indexOf('O'));
        System.out.println("Index of O from 2: " + str.indexOf('O',2));
        System.out.println("Index of CO: " + str.indexOf("CO"));
        System.out.println("Index of O: " + str.lastIndexOf('O'));
        System.out.println("Index of O from 2: " + str.lastIndexOf('O',2));


        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println("Are the two reference equal: ");
        System.out.println(str1 == str2);
        System.out.println("Are the two reference equal: ");
        System.out.println(str1 == str3);
        System.out.println("Are the two values equal: ");
        System.out.println(str1.equals(str3));

        str1 = "Java";
        str2 = "JAVA";

        System.out.println("Are the two values equal: ");
        System.out.println(str1.equals(str2));
        System.out.println("Are the two values equal: ");
        System.out.println(str1.equalsIgnoreCase(str2));

        str1 = "Java";
        str2 = "Python";
        System.out.println("Comparing two string: " + str1.compareTo(str2));
        System.out.println("Comparing two string: " + str2.compareTo(str1));


        str = String.valueOf(400);
        System.out.println("Example of valueOf: " + str);
        System.out.println(str.getClass().getSimpleName());

        System.out.println("Index of '.' : " + str.indexOf('.'));
        System.out.println("Index of '.' from 7 : " + str.indexOf('.',7));
        System.out.println("Last index of '.' : " + str.lastIndexOf('.'));
        System.out.println("Last index of '.' from 7: " + str.lastIndexOf('.', 7));

        System.out.println("To Char Array: " + str.toCharArray());




    }
}
