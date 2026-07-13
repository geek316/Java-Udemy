package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level2EasyMediumProblem1 {
    static void main() {

//        7. Find Largest Number
//        Input: [12, 45, 3, 78, 23]
//        Output: Largest = 78
//        Do it manually using loops.

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(45);
        nums.add(3);
        nums.add(78);
        nums.add(23);

        System.out.println("Number list: " + nums);

        int max = 0;
        for(int i=0; i<nums.size(); i++) {
            if(nums.get(i)>max) {
                max = nums.get(i);
            }
        }
        System.out.println("Largest number: " + max);
    }
}
