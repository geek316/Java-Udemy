package learningstrings;

public class StudentChallengeRegularExpression2 {
    public static void main(String[] args) {

        // Remove special characters from a string.

        String str = "  ##Hello world,    this is/ java **program ";
        System.out.println("Original String is: '" + str+"'\n");

        str = str.replaceAll("[^a-zA-Z0-9\\s]*", "");
        System.out.println("Removing special characters from string: " + str);


        // Remove extra spaces from a string.

        str = str.replaceAll("\\s+", " ").trim();
        System.out.println("Removing extra space from string: " + str);


        // Find Number of Words in a string.

        String[] words = str.split("\\s");
        System.out.println("Number of Words: " + words.length);

    }
}
