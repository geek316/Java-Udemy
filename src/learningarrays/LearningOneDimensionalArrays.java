package learningarrays;

public class LearningOneDimensionalArrays {
    public static void main(String[] args) {

        // Every array in java is an object and is created in heap memory.
        int[] nums = new int[5];
        System.out.println(nums.length);


        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(nums2.length);

        int[] nums3;
        nums3 = new int[5];


        for(int i=0; i<nums.length; i++){
            System.out.print(nums2[i]);
        }

        System.out.println();

        for(int i=nums2.length-1; i>=0; i--){
            System.out.print(nums2[i]);
        }

        System.out.println();

        for(int x: nums) {
            System.out.print(x);
        }

    }
}
