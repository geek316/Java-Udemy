package learningloops;

public class StudentChallengeArmstrongNumber {
    public static void main(String[] args) {

        // Display Digits of a number.
        int num = 1234;

        System.out.println("Digits of a number are: ");
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }


        // Count Digits
        System.out.println("Count of Digits of a number is: ");

        num = 12345;
        int cnt = 0;

        while (num != 0) {
            num = num / 10;
            cnt += 1;
        }
        System.out.println(cnt);


        // Find the number is Armstrong or not.
        // if the cube of each digit is equal to the number itself, then it is Armstrong number.

        int originalNum = 153;
        num = originalNum;
        int sum = 0;

        while (num != 0) {
            int remainder = num % 10;
            sum += remainder * remainder * remainder;
            num = num / 10;
        }

        if (sum == originalNum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }


        // Reverse the number.

        num = 54321;
        int reverse = 0;

        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        System.out.println("Reverse of the number is: " + reverse);


        // Check if the number is Palindrome or not.

        Integer origNum = 123321;
        Integer num1 = origNum;
        Integer reverse1 = 0;

        while (num1 != 0) {
            int remainder = num1 % 10;
            reverse1 = reverse1 * 10 + remainder;
            num1 = num1 / 10;
        }

        if (origNum.equals(reverse1)) {
            System.out.println("Number is palindrome: " + origNum);
        } else {
            System.out.println("Number is not a palindrome: " + origNum);
        }


    }
}
