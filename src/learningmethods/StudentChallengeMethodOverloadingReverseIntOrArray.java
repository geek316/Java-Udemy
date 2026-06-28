package learningmethods;

public class StudentChallengeMethodOverloadingReverseIntOrArray {
    public static void main(String[] args) {

        int number = 12345;
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Reversed number is : " + reverseValue(number));
        System.out.print("Reversed array is :");
        int[] rev = reverseValue(array);
        for(int x : rev) {
            System.out.print(x);
        }


    }

    static int reverseValue(int num) {

        int reverseNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        return reverseNum;
    }

    static int[] reverseValue(int[] array) {

        int[] reverseArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArray[j] = array[i];
        }

        return reverseArray;
    }

}



