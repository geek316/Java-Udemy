package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level3MediumProblem3 {
    static void main() {

//        15. Merge Two ArrayLists
//        Input:
//        list1 = [1, 2, 3]
//        list2 = [4, 5, 6]
//        Output: [1, 2, 3, 4, 5, 6]

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        list1.addAll(list2);
        System.out.println("Output: " + list1);

    }
}
