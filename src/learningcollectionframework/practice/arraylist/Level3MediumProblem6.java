package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Level3MediumProblem6 {
    static void main() {

//        18. Rotate List by One Position
//        Input: [1, 2, 3, 4, 5]
//        Output: [5, 1, 2, 3, 4]

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println("Input: " + nums);

        int last = nums.remove(nums.size()-1);
        nums.add(0, last);

//        Collections.rotate(nums, 1);

        System.out.println("Output: " + nums);


    }
}
