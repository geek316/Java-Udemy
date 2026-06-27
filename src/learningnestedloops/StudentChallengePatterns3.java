package learningnestedloops;

public class StudentChallengePatterns3 {
    public static void main(String[] args) {

//        Print this pattern
// *  *  *  *  *
//   *  *  *  *
//      *  *  *
//         *  *
//            *

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j >= i) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


        System.out.println();


//        Print this pattern
//            *
//         *  *
//      *  *  *
//   *  *  *  *
//*  *  *  *  *

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (j > i) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }

        System.out.println();

    }
}
