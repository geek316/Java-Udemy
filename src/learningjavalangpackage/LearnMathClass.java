package learningjavalangpackage;

public class LearnMathClass {
    static void main() {

        float i = -100.98f;
        int j = 230;

        System.out.println("Absolute of " + i + " is " + Math.abs(i));          // Absolute value of a number
        System.out.println("Absolute of " + i + " is " + StrictMath.abs(i));    // Absolute value of a number
        System.out.println("Cuberoot of " + j + " is " + Math.cbrt(j));         // Cube root of a number
        System.out.println("Exact decrement: " + Math.decrementExact(j));       // Exact decrement of a number
//        System.out.println("Exact increment: " + Math.incrementExact(Integer.MAX_VALUE));       // Exact increment of a number, prevent underflow.
        System.out.println("Exponent value in float point representation: " + Math.getExponent(j));
        System.out.println("Floor division: " + Math.floorDiv(j, 27));
        System.out.println("Exponential of " + i + " is " + Math.exp(j));
        System.out.println("Log of " + i + " is " + Math.log(i));
        System.out.println("Log10 of " + i + " is " + Math.log10(i));
        System.out.println("Maximum of two number is: " + Math.max(i, j));
        System.out.println("Minimum of two number is: " + Math.min(i, j));
        System.out.println("Round of " + i + " is " + Math.round(i));
        System.out.println("Random number is: " + Math.random());
        System.out.println("Square root of " + i + " is " + Math.sqrt(i));
        System.out.println("Power of " + i + " is " + Math.pow(i, i));



    }
}
