package learningcollectionframework;

import java.util.ArrayList;

public class LearnListInterfaceMethods {
    static void main() {

        ArrayList list = new ArrayList();
        ArrayList otherList = new ArrayList();

        list.add(10);
        list.add("Summi");
        list.add(10.5);
        list.add(true);
        list.add('a');
        list.add(null);
        otherList.add(11);
        otherList.add("Hemant");

        System.out.println("Methods of arraylist");
        System.out.println("Current list: " + list);

        // Add
        list.add(0, "New Admission");
        System.out.println("Adding element in list at specific index: " + list);

        // Add all
        list.addAll(1, otherList);
        System.out.println("Adding all elements from other list to list at specific index: " + list);

        // Remove
        list.remove(1);
        System.out.println("Removing element from list at specific index: " + list);

        // Get
        System.out.println("Getting element from list at specific index: " + list.get(6));

        // Set
        list.set(6, "Summi");
        System.out.println("Setting element in list at specific index: " + list);

        // Sublist
        System.out.println("Sublist of list: " + list.subList(0, 3));

        // Index of
        System.out.println("Index of element in list: " + list.indexOf("Summi"));

        // Last index of
        System.out.println("Last index of element in list: " + list.lastIndexOf("Summi"));

        // List iterator
        System.out.println("List iterator of list: " + list.listIterator());

        // List iterator from specific index
        System.out.println("List iterator of list from specific index: " + list.listIterator(2));


    }
}
