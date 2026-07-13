package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level3MediumProblem1 {
    static void main() {

//        13. Find Second Largest Number
//        Input: [10, 20, 30, 40, 50]
//        Output: Second Largest = 40

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        System.out.println("Numbers: " + nums);

        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for(Integer val : nums) {
            if (val > large) {
                large = val;
            }
        }

        for(Integer val: nums) {
            if (val > secondLarge && val < large) {
                secondLarge = val;
            }
        }

        System.out.println("Second largest number is: " + secondLarge);

    }
}
