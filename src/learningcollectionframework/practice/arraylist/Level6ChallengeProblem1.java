package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;
import java.util.Comparator;

public class Level6ChallengeProblem1 {
    static void main() {

//        28. Find Missing Number
//        List contains: [1,2,3,5,6]
//        Output: 4

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(3);
        nums.add(1);
        nums.add(6);

        nums.sort(Comparator.comparing(num -> num));
        System.out.println("Number List: "+ nums);

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i + 1) - nums.get(i) > 1) {
                System.out.println("Missing Num: " + (nums.get(i) + 1));
            }
        }
    }
}
