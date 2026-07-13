package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level2EasyMediumProblem2 {
    static void main() {

//        8. Find Smallest Number
//        Input: [12, 45, 3, 78, 23]
//        Output: Smallest = 3

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(45);
        nums.add(3);
        nums.add(78);
        nums.add(23);

        System.out.println("Number list: " + nums);

        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.size(); i++) {
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        System.out.println("Smallest : " + min);

    }
}
