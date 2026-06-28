package learningmethods;

public class StudentChallengeFindMaxElementInAnArray {
    public static void main(String[] args) {

        // Find max element in an array.
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Max element in array is: " + maxOfElement(arr));
    }

    static int maxOfElement(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
