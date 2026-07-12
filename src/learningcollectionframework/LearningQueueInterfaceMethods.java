package learningcollectionframework;

import java.util.LinkedList;
import java.util.Queue;

public class LearningQueueInterfaceMethods {
    static void main() {

        Queue queue = new LinkedList();
        Queue anotherQueue = new LinkedList();


        // Add element
        queue.add(10);
        queue.add("Summi");
        queue.add(10.5);
        queue.add(true);
        queue.add('a');
        queue.add(null);
        System.out.println("Adding element to queue: " + queue);

        // Poll element
        queue.poll();
        System.out.println("Polling element from queue: " + queue);
        anotherQueue.poll();
        System.out.println("Polling element from another queue: " + anotherQueue);

        // Remove element
        queue.remove();
        System.out.println("Removing element from queue: " + queue);
//        anotherQueue.remove(); // throws exception if element is not found
//        System.out.println("Removing element from another queue: " + anotherQueue);

        // Peek element
        System.out.println("Peeking element from queue: " + queue.peek());
        System.out.println("Peeking element from another queue: " + anotherQueue.peek());

        // Element
        System.out.println("Element from queue: " + queue.element());
//        System.out.println("Element from another queue: " + anotherQueue.element()); // throws exception if element is not found
    }
}
