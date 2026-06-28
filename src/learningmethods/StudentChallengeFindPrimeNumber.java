package learningmethods;

import java.util.Scanner;

public class StudentChallengeFindPrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Find a number is prime.
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Is number prime: " + isPrime(num));

    }

    static boolean isPrime(int num) {

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
