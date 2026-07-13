package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level2EasyMediumProblem4 {
    static void main() {

//        10. Count Even Numbers
//        Input: [2, 5, 8, 7, 10]
//        Output: Even count = 3

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(8);
        nums.add(7);
        nums.add(10);

        System.out.println("Number list: " + nums);

        int evenCount = 0;
        for(Integer val : nums) {
            if(val%2==0){
                evenCount++;
            }
        }
        System.out.println("Even count: " + evenCount);

    }
}
