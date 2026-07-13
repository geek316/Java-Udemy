package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level2EasyMediumProblem6 {
    static void main() {

//        12. Remove Duplicates
//        Input: [1, 2, 2, 3, 4, 4, 5]
//        Output: [1, 2, 3, 4, 5]

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(4);
        nums.add(5);

        System.out.println("Input: " + nums);

        for(int i=0; i<nums.size(); i++) {
            for(int j=i+1; j<nums.size()-1; j++) {
                if(nums.get(i).equals(nums.get(j))){
                    nums.remove(nums.get(j));
                }
            }
        }
        System.out.println("Output: " + nums);

    }
}
