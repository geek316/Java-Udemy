package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Level5HardProblem1 {
    static void main() {

//        23. Remove All Duplicate Elements Completely
//        Input: [1, 2, 2, 3, 3, 4, 5]
//        Output: [1, 4, 5]
//        Notice:
//        2 appears twice → remove all 2s
//        3 appears twice → remove all 3s

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println("Input: " + nums);
        ArrayList<Integer> uniqueNums = new ArrayList<>();

        for (Integer num : nums) {
            if (Collections.frequency(nums, num) == 1) {
                uniqueNums.add(num);
            }
        }

        System.out.println("Output: " + uniqueNums);
    }
}
