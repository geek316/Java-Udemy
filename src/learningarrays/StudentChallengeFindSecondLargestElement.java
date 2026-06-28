package learningarrays;

public class StudentChallengeFindSecondLargestElement {
    public static void main(String[] args) {

        // Finding sum of all elements.
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for(int val: arr) {
            sum += val;
        }
        System.out.println("Sum of all the elements in the array is : " + sum);

        // Searching an element
        int[] arr2 = {1, 2, 3, 4, 5};
        int searchElement = 3;

        for(int i=0; i<arr2.length; i++) {
            if(arr2[i] == searchElement) {
                System.out.println("Element found at index : " + i);
            }
        }

        // Finding Maximum element
        int[] arr3 = {1, 2, 3, 4, 5};
        int maxElement = arr3[0];

        for(int val: arr3){
            if(val>maxElement) {
                maxElement=val;
            }
        }
        System.out.println("Maximum element in the array is: " + maxElement);

        // Finding Second-largest element
        int[] arr4 = {1, 2, 3, 4, 5,13,3,134,2,56,32,8};
        int largestElement = arr4[0];
        int secondLargestElement = arr4[0];

        for(int val : arr4) {
            if(val>largestElement){
                secondLargestElement=largestElement;
                largestElement=val;
            } else if (val>secondLargestElement) {
                secondLargestElement=val;
            }
        }
        System.out.println("Second largest element in the array is: " + secondLargestElement);

    }
}
