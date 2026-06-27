package learningloops;

import java.util.Scanner;

public class StudentChallengeFactorial {
    public static void main(String[] args) {

        // Display multiplication table.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Multiplication table of " + num + " is: ");
        for (int i=1; i<=10; i++) {
            System.out.println(num + " * " + i + " = " + (num*i));
        }


        // Find sum of N numbers.

        int sum = 0;
        for (int i=1; i<=num; i++) {
            sum +=i;
        }
        System.out.println("Sum of " + num + " number is: " + sum);

        // Find factorial of a number.

        int mul = 1;
        for (int i=1; i<=num; i++) {
            mul *=i;
        }
        System.out.println("Factorial of " + num + " number is: " + mul);


    }
}
