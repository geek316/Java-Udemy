package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level1EasyProblem3 {
    static void main() {

//        3. Find Size of List
//        Create an ArrayList of 7 fruits.
//        Print: Number of fruits = 7
//        Use: size()

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Litchi");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Sugarcane");
        fruits.add("Jackfruit");

        System.out.println("Fruits: " + fruits);
        System.out.println("Number of fruits = " + fruits.size());


    }
}
