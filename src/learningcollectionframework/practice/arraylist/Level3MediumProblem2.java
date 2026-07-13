package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level3MediumProblem2 {
    static void main() {

//        14. Frequency of Each Element
//        Input: [1, 2, 2, 3, 3, 3]
//        Output: 1 -> 1, 2 -> 2, 3 -> 3

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(3);

        System.out.println("Number list: " + nums);

        ArrayList<Integer> uniqueNums = new ArrayList<>(nums.size());

        for(int i=0; i<nums.size(); i++){
            if(!uniqueNums.contains(nums.get(i))){
                uniqueNums.add(nums.get(i));
            }
        }
//        System.out.println("Unique list: " + uniqueNums);

        for(int i=0; i<uniqueNums.size(); i++) {
            int count = 0;
            for(int j=0; j<nums.size(); j++) {
                if (uniqueNums.get(i).equals(nums.get(j))){
                    count++;
                }
            }
            System.out.println(uniqueNums.get(i) + " -> " + count);
        }


    }
}
