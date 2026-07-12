package learningstrings;

import java.util.Date;

public class StudentChallengeRegularExpression1 {
    public static void main(String[] args) {

        // Find if a number is binary or not.

        Integer number = 121101010;
        String str = String.valueOf(number);
        if(str.matches("[0|1]*")){
            System.out.println("Number is Binary");
        }else{
            System.out.println("Number is not Binary");
        }

        // Find if a number is hexadecimal or not.

        String hexNumber = "1AZA";
        if(hexNumber.matches("[0-9A-F]+")){
            System.out.println("Number is Hexadecimal");
        }else{
            System.out.println("Number is not Hexadecimal");
        }


        // Find if the data is Date format (dd/mm/yyyy).

        String date = "11/03/1990";

        if (date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}")) {
            System.out.println(date + " : Date is in dd/mm/yyyy format");
        }else{
            System.out.println(date + " : Date is not in dd/mm/yyyy format");
        }

    }
}
