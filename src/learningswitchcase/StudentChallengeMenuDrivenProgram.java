package learningswitchcase;

import java.util.Scanner;

public class StudentChallengeMenuDrivenProgram {
    public static void main(String[] args) {

        // Make a menu-driven program of arithmetic operations.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers for arithmetic operations: ");
        double num1 = sc.nextInt(), num2 = sc.nextInt();

        System.out.println("Enter an operator (+, -, *, /): ");
        String operator = sc.next();

        switch(operator) {
            case "+":
                System.out.println("Sum of two num is : " + (num1 + num2));
                break;
            case "-":
                System.out.println("Difference of two num is : " + (num1 - num2));
                break;
            case "*":
                System.out.println("Multiplication of two num is : " + (num1 * num2));
                break;
            case "/":
                System.out.println("Division of two num is : " + (num1 / num2));
                break;
            default:
                System.out.println("Wrong input provided!");
                break;
        }

    }
}
