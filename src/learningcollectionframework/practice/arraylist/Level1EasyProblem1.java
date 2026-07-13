package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level1EasyProblem1 {
    static void main() {

        // 1. Store and Print Names
        // Create an ArrayList<String> and store 5 names.
        //  Print:
        //  All names
        //  First name
        //  Last name
        //  Example: [Alice, Bob, Charlie, David, Emma]
        //  Output:
        //  First name: Alice
        //  Last name: Emma

        ArrayList<String> strings = new ArrayList<>();

        strings.add("Summi");
        strings.add("Hemant");
        strings.add("Mukesh");
        strings.add("Anshal");
        strings.add("Neel");

        System.out.println("All Names: " + strings);
        System.out.println("First Name: " + strings.getFirst());
        System.out.println("Last Name: " + strings.getLast());

    }
}
