package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level6ChallengeProblem2 {
    static void main() {

//        29. Find First Repeating Element
//        Input: [1,3,4,2,3,5]
//        Output: 3

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(4);
        nums.add(2);
        nums.add(3);
        nums.add(5);

        System.out.println("Input : " + nums);

        for(int i=0; i<nums.size(); i++){
            for(int j=i+1; j<nums.size()-1; j++){
                if(nums.get(i).equals(nums.get(j))){
                    System.out.println("Output: " + nums.get(i));
                }
            }
        }
    }
}
