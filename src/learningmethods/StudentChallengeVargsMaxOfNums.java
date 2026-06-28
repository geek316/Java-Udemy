package learningmethods;

public class StudentChallengeVargsMaxOfNums {
    public static void main(String[] args) {

        int[] nums = {98, 3, 24, 56, 72, 22, 26, 12};

        System.out.println("Max of Nums is : " + maxOfNums(nums));
        System.out.println("Max of Nums is : " + maxOfNums(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Max of Nums is : " + maxOfNums(1));

    }

    static int maxOfNums(int... nums) {
        int max = Integer.MIN_VALUE;
        if (nums.length == 0)
            return max;
        else
            for (int num : nums) {
                if (num > max) {
                    max = num;
                }
            }
        return max;
    }
}
