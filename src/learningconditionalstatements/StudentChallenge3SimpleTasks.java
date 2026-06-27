package learningconditionalstatements;

import java.util.Scanner;

public class StudentChallenge3SimpleTasks {
    public static void main(String[] args) {

        // Find if a number is odd or even.
        Integer num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        if(num%2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // Find person is young or not young.

        int age;

        System.out.println("Enter the age of a person: ");
        age = sc.nextInt();

        if(age >= 14 && age < 30) {
            System.out.println("Person is young");
        } else {
            System.out.println("Person is not young");
        }

        // Find grades for given marks.

        int mark;

        System.out.println("Enter mark of student: ");
        mark = sc.nextInt();

        if(mark>=90) {
            System.out.println("Grade A");
        } else if (mark>=70) {
            System.out.println("Grade B");
        } else if (mark>=40) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

    }
}
