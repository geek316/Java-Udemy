package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level1EasyProblem5 {
    static void main() {

//        5. Check if Element Exists
//        List: ["Java", "Python", "C++"]
//        Check whether exists : "Python"
//        Output: Found or Not Found

        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("Original List : " + languages);
        System.out.println("If Python exits in the list : " + languages.contains("Python"));


    }
}
