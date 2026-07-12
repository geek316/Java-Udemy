package learningcollectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class LearningArrayListAndIterator {
    static void main() {

        ArrayList<Integer> array = new ArrayList<>(20);
        ArrayList<Integer> otherArray = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        System.out.println("Array: " + array);
        System.out.println("Another array: " + otherArray);

        // Iteration - accessing all the elements in arraylist

        System.out.println("[1] Iteration - accessing all the elements in arraylist via for loop");
        for(int i=0; i<=array.size()-1; i++) {
            System.out.println(array.get(i));
        }

        System.out.println("[2] Iteration - accessing all the elements in arraylist via for-each loop");
        for(var val : array) {
            System.out.println(val);
        }

        System.out.println("[3] Iteration - accessing all the elements in arraylist via iterator");
        for(Iterator<Integer> iterator = array.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }

        System.out.println("[4] Iteration - accessing all the elements in arraylist via list iterator");
        for(ListIterator<Integer> listIterator = array.listIterator(); listIterator.hasNext();){
            System.out.println(listIterator.next());
        }

        System.out.println("[5] Iteration - accessing all the elements in arraylist via do-while loop");
        Iterator<Integer> iterator = array.iterator();
        if (iterator.hasNext()) {
            do {
                System.out.println(iterator.next());
            } while (iterator.hasNext());
        }

        System.out.println("[6] Iteration - accessing all the elements in arraylist via while loop");
        Iterator<Integer> iterator2 = array.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        System.out.println("[7] Iteration - accessing all the elements in arraylist via lambda expression");
        array.forEach(val -> System.out.println(val));


        System.out.println("[8] Iteration - accessing all the elements in arraylist via method reference");
        array.forEach(System.out::println);

    }
}


