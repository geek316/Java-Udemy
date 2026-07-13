package learningcollectionframework.practice.arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Level1EasyProblem4 {
    static void main() {

//        4. Print All Elements Using Loop
//        Create: [5, 10, 15, 20, 25]
//        Print each element using:
//        for loop
//        enhanced for loop

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(10);
        nums.add(15);
        nums.add(20);
        nums.add(25);

        System.out.println("For loop");
        for(int i=0; i<nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        System.out.println("For each loop");
        for (Integer val : nums) {
            System.out.println(val);
        }

        System.out.println("Lambda Function");
        nums.forEach(val -> System.out.println(val));

        System.out.println("Method reference");
        nums.forEach(System.out::println);

    }
}
