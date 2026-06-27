package learningconditionalstatements;

import java.util.Scanner;

public class StudentChallengeTypeOfWebsites {
    public static void main(String[] args) {

        // Display name of a day based on number.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7: ");
        int num = sc.nextInt();

        if(num == 1)
            System.out.println("Monday");
        else if (num ==2)
            System.out.println("Tuesday");
        else if (num ==3)
            System.out.println("Wednesday");
        else if (num ==4)
            System.out.println("Thursday");
        else if (num ==5)
            System.out.println("Friday");
        else if (num ==6)
            System.out.println("Saturday");
        else if (num ==7)
            System.out.println("Sunday");
        else
            System.out.println("Invalid Input");


        // Find type of website and the protocol used.

        String website = "https://www.google.com";

        if (website.contains("https")) {
            System.out.println("Hypertext transfer protocol secured");
            if (website.endsWith(".com")) {
                System.out.println("Commercial");
            } else if (website.endsWith(".gov")) {
                System.out.println("Government");
            } else if (website.endsWith(".org")) {
                System.out.println("Organization");
            }
        } else if (website.contains("http")) {
            System.out.println("Hypertext transfer protocol");
            if (website.endsWith(".com")) {
                System.out.println("Commercial");
            } else if (website.endsWith(".gov")) {
                System.out.println("Government");
            } else if (website.endsWith(".org")) {
                System.out.println("Organization");
            }
        } else if (website.contains("ftp")) {
            System.out.println("File transfer protocol");
            if (website.endsWith(".com")) {
                System.out.println("Commercial");
            } else if (website.endsWith(".gov")) {
                System.out.println("Government");
            } else if (website.endsWith(".org")) {
                System.out.println("Organization");
            }
        } else {
            System.out.println("Invalid Website");
        }

    }
}
