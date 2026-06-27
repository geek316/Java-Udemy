package learningloops;

public class StudentChallengeDisplayNumbersInWords {
    public static void main(String[] args) {

        // Display numbers in words.

        int num = 1890;
        int val = 0;
        String rev = "";
        System.out.println("Original Number: " + num);

        while (num != 0) {
            val = num % 10;
            rev = rev.concat(String.valueOf(val));
            num = num / 10;
        }

        System.out.print("Number in words: ");
        for (int i = rev.length() - 1; i >= 0; i--) {
            char chr = rev.charAt(i);
            switch (chr) {
                case '0':
                    System.out.print("zero ");
                    break;
                case '1':
                    System.out.print("one ");
                    break;
                case '2':
                    System.out.print("two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("six ");
                    break;
                case '7':
                    System.out.print("seven ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("nine ");
                    break;
            }
        }

    }
}
