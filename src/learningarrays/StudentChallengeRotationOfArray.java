package learningarrays;

public class StudentChallengeRotationOfArray {
    public static void main(String[] args) {

        // Rotation of Array
        int[] arr = {1, 2, 3, 4, 5};
        int temp = arr[0];

        for (int i = 0; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;

        System.out.print("Rotated Array: ");
        for (int val : arr) {
            System.out.print(val);
        }

        System.out.println();

        // Inserting an element
        int[] arr2 = new int[10];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

        int index = 2;
        int val = 7;
        int n = 6;

        for (int i = n - 1; i >= index; i--) {
            arr2[i + 1] = arr2[i];
        }
        arr2[index] = val;

        System.out.println("\nArray after insertion: ");
        for (int x : arr2) {
            System.out.print(x);
        }

        // Deleting an element
        int[] arr3 = new int[10];
        arr3[0] = 1;
        arr3[1] = 2;
        arr3[2] = 3;
        arr3[3] = 4;
        arr3[4] = 5;
        arr3[5] = 6;

        int indx = 2;
        int nth = 6;

        for (int i = indx; i <nth; i++) {
            arr3[i] = arr3[i+1];
        }

        System.out.println("\nArray after Deletion: ");
        for (int x : arr3) {
            System.out.print(x);
        }

    }
}
