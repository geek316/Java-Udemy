package learningmethods;

import java.util.Scanner;

public class StudentChallengeFindGCDOf2Numbers {
    public static void main(String[] args) {

        // Find GCD of two numbers.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2));

    }

    static int findGCD(int num1, int num2) {


        for (int i = Math.min(num1, num2); i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;

    }
}
