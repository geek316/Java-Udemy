package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level2EasyMediumProblem5 {
    static void main() {

//        11. Reverse an ArrayList
//        Input: [1, 2, 3, 4, 5]
//        Output: [5, 4, 3, 2, 1]
//        Without using: Collections.reverse()

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println("Number list: " + nums);

        ArrayList<Integer> reverseNums = new ArrayList<>(nums.size());

        for (int i = nums.size() - 1; i >= 0; i--) {
            reverseNums.add(nums.get(i));
        }
        System.out.println("Reverse list: " + reverseNums);

    }
}
