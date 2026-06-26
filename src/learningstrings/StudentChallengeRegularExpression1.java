package learningstrings;

public class StudentChallengeRegularExpression1 {
    public static void main(String[] args) {

        // Find if a number is binary or not.
        // Find is a number is hexadecimal or not.
        // Find is the data is Date format (dd/mm/yyyy).

        String str = "1010";
        if(str.matches("[0|1]*")){
            System.out.println("Binary");
        }else{
            System.out.println("Not Binary");
        }


    }
}
