package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level2EasyMediumProblem3 {
    static void main() {

//        9. Sum of Elements
//        Input: [10, 20, 30, 40]
//        Output: Sum = 100

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        System.out.println("Elements in list: " + nums);

        int sum = 0;
        for(Integer val : nums){
            sum +=val;
        }
        System.out.println("Sum of the elements: " + sum);

    }
}
