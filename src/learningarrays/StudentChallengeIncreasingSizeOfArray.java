package learningarrays;

public class StudentChallengeIncreasingSizeOfArray {
    public static void main(String[] args) {

        // Copying an array
        int[] arr = {1, 2, 3, 4, 5};
        int[] copyArr = new int[arr.length];

        System.out.print("Original Array: ");
        for(int val : arr) {
            System.out.print(val);
        }

        System.out.print("\nCopied Array before copying: ");
        for(int val : copyArr) {
            System.out.print(val);
        }

        for(int i=0; i<arr.length; i++) {
            copyArr[i] = arr[i];
        }

        System.out.print("\nCopied Array after copying: ");
        for(int val : copyArr) {
            System.out.print(val);
        }


        // Reverse copying an array
        int[] reverseArr = new int[arr.length];

        // One Way
        for(int i=0; i<arr.length; i++) {
            reverseArr[i] = arr[arr.length-1-i];
        }

        // Another Way
        for(int i=arr.length-1, j=0; i>=0; i--, j++) {
            reverseArr[j] = arr[i];
        }

        System.out.print("\nReverse Array: ");
        for(int val : reverseArr) {
            System.out.print(val);
        }


        // Increasing size of an array
        System.out.print("\nOriginal length of arr: " + arr.length);

        int[] increaseArray = new int[arr.length * 2];

        for(int i=0; i<arr.length; i++) {
            increaseArray[i] = arr[i];
        }

        arr = increaseArray;
        increaseArray = null;

        System.out.print("\nNew length of arr: " + arr.length);

        System.out.print("\nElements of Arr: ");
        for(int x : arr) {
            System.out.print(x);
        }

    }
}
