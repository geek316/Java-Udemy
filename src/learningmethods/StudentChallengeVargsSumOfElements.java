package learningmethods;

public class StudentChallengeVargsSumOfElements {
    public static void main(String[] args) {

        int[] nums = {45, 32, 56, 73, 46, 77, 54, 12};
        System.out.println("Sum of Nums is : " + sumOfNums(nums));
    }

    static int sumOfNums(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
