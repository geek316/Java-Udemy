package learningloops;

import java.util.Scanner;

public class StudentChallengeFibonacci {

    public static void main(String[] args) {

        // Display arithmetic progression of a number.
        System.out.println("Arithmetic Progression");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting number: ");
        int startNum = sc.nextInt();

        System.out.println("Enter common difference: ");
        int diff = sc.nextInt();

        System.out.println("Enter the number of terms: ");
        int numTerms = sc.nextInt();

        for (int i=0; i<numTerms; i++) {
            System.out.print(startNum + " ");
            startNum += diff;
        }


        // Display geometric progression of a number.
        System.out.println("\n\nGeometric Progression");
        System.out.println("Enter the starting number: ");
        startNum = sc.nextInt();

        System.out.println("Enter common difference: ");
        diff = sc.nextInt();

        System.out.println("Enter the number of terms: ");
        numTerms = sc.nextInt();

        for (int i=0; i<numTerms; i++) {
            System.out.print(startNum + " ");
            startNum *= diff;
        }


        // Display fibonacci series of a number.
        System.out.println("\n\nFibonacci Series");

        System.out.println("Enter the number of terms for fibonacci series: ");
        numTerms = sc.nextInt();

        startNum = 0;
        int secondNum = 1;
        int helper =0;
        System.out.println("Fibonacci Series: ");
        System.out.print(startNum + ",");
        System.out.print(secondNum + ",");

        for (int i=1; i<=numTerms; i++) {
            helper = startNum;
            startNum = secondNum;
            secondNum = helper + secondNum;
            System.out.print(secondNum + ",");

        }

//        0,1,1,2,3,5,8,13,21,34,


    }
}
