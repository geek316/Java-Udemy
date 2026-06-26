package learningstrings;

public class StudentChallengeStringMethods {
    public static void main(String[] args) {

        String str = "programmer@gmail.com";


        // Find if the email id is on gmail.

        int indexOfAt = str.indexOf('@');
        int indexOfDot = str.lastIndexOf('.');

        String email = str.substring(indexOfAt+1,indexOfDot);
        if(email.equals("gmail")){
            System.out.println("Email is on gmail");
        }else{
            System.out.println("Email is not on gmail");
        }

        // Find username and domain name from email.
        System.out.println("Username: " + str.substring(0,indexOfAt));
        System.out.println("Domain Name: " + str.substring(indexOfAt+1));

    }
}
