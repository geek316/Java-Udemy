package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level1EasyProblem2 {
    static void main() {

//        2. Add and Remove Elements
//        Store numbers: 10, 20, 30, 40, 50
//        Tasks:
//        Add 60
//        Remove 30
//        Print final list
//        Expected: [10, 20, 40, 50, 60]

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        System.out.println("Original elements in list: " + nums);

        nums.add(60);
        nums.remove(Integer.valueOf(30));
        System.out.println("Final List after adding 60 and removing 30 : " + nums);

    }
}
