package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level1EasyProblem6 {
    static void main() {

//        6. Replace an Element
//        Given: ["Red", "Blue", "Green"]
//        Replace: Blue -> Yellow
//        Output: [Red, Yellow, Green]

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        System.out.println("Original color list: " + colors);
        int iob = colors.indexOf("Blue");
        colors.remove("Blue");
        colors.add(iob, "Yellow");
        System.out.println("Replacing blue with yellow: " + colors);


    }
}
