package learningconditionalstatements;

public class StudentChallengeFindRadix {
    public static void main(String[] args) {

        // Find radix of a number given in a string.
        // * Binary: [01]*
        // * Octal: [0-7]*
        // * Decimal: [0-9]*
        // * Hexadecimal: [0-9A-F]*

        String nums = "101010";

        if (nums.matches("[01]+")) {
            System.out.println("Binary");
        } else if (nums.matches("[0-8]*")) {
            System.out.println("Octal");
        } else if (nums.matches("[0-9]*")) {
            System.out.println("Decimal");
        } else if (nums.matches("[0-9A-F]*")) {
            System.out.println("Hexadecimal");
        }


        // Find a given year is a leap year or not.
        // * Divisible by 4 is leap year.
        // * Divisible by 100 is not leap year.
        // * Divisible by 400 is leap year.

        int year = 1900;

        if (year%4==0 && year%100!=0 || year%400==0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
