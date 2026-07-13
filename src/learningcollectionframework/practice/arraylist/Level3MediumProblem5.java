package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level3MediumProblem5 {
    static void main() {

//        17. Sort Without Collections.sort()
//        Input: [5, 2, 8, 1, 4]
//        Output: [1, 2, 4, 5, 8]
//        Use a sorting algorithm yourself.

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(2);
        nums.add(8);
        nums.add(1);
        nums.add(4);

        System.out.println("Input: " + nums);

        int val = 0;
        for(int i=0; i<nums.size(); i++){
            for(int j=0; j<nums.size()-1; j++){
                if(nums.get(j)>nums.get(j+1)){
                    val = nums.get(j);
                    nums.set(j, nums.get(j+1));
                    nums.set(j+1, val);
                }
            }
        }
        System.out.println("Output: " + nums);





    }
}
