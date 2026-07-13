package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level6ChallengeProblem3 {
    static void main() {

//        30. Find Pair With Given Sum
//        Input:
//        [2,7,11,15]
//        Target = 9
//        Output:
//        2 + 7 = 9

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(7);
        nums.add(11);
        nums.add(15);

        System.out.println("Input: " + nums);

        int target = 9;
        System.out.println("Target: " + target);

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size() - 1; j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    System.out.println(nums.get(i) + " + " + nums.get(j) + " = " + target);
                }
            }
        }
    }
}
