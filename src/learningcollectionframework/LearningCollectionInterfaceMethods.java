package learningcollectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class LearningCollectionInterfaceMethods {
    static void main() {

        Collection collection = new ArrayList();
        Collection otherCollection = new ArrayList();
        Collection anotherCollection = new ArrayList();

        // Add element
        collection.add(10);
        collection.add("Hello");
        collection.add(10.5);
        collection.add(true);
        collection.add('a');
        collection.add(null);
        System.out.println("Adding element to collection: " + collection);
        otherCollection.add(10);
        otherCollection.add("Hello");
        System.out.println("Adding element to small collection: " + otherCollection);
        anotherCollection.add(10.5);
        System.out.println("Adding element to another collection: " + anotherCollection);

        // Add all elements
        collection.addAll(collection);
        System.out.println("Adding a collection to existing collection: " + collection);

        // Remove element
        collection.remove(10);
        System.out.println("Removing element from collection: " + collection);

        // Contains element
        collection.contains(10);
        System.out.println("Contains element in collection: " + collection.contains(10));

        // Contains all elements
        collection.containsAll(anotherCollection);
        System.out.println("Contains all elements in collection: " + collection.containsAll(anotherCollection));

        // Equals
        collection.equals(otherCollection);
        System.out.println("Are collections equal: " + collection.equals(otherCollection));

        // Size of collection
        collection.size();
        System.out.println("Size of collection: " + collection.size());

        // Iterator
        collection.iterator();
        System.out.println("Iterator of collection: " + collection.iterator());

        // toArray
        collection.toArray();
        System.out.println("Array of collection: " + collection.toArray());

        // Remove all elements
        collection.removeAll(otherCollection);
        System.out.println("Removing all elements of smallCollection from collection: " + collection);

        // Retain all elements
        collection.retainAll(anotherCollection);
        System.out.println("Retaining all elements from collection: " + collection);

        // Clear collection
        collection.clear();
        System.out.println("Clearing collection: " + collection);

        // Check if collection is empty
        collection.isEmpty();
        System.out.println("Is collection empty: " + collection.isEmpty());
    }
}
