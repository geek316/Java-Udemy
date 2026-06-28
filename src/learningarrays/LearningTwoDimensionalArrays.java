package learningarrays;

public class LearningTwoDimensionalArrays {
    public static void main(String[] args) {

        // Creating a 2D array
        int[][] twoDArrayType1 = new int[3][4];

        int[][] twoDArrayType2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] twoDArrayType3;
        twoDArrayType3 = new int[3][4];


        // printing 2D array
        System.out.println("Using for loop");
        for(int i=0; i<twoDArrayType2.length; i++) {
            for(int j=0; j<twoDArrayType2[i].length; j++) {
                System.out.print(twoDArrayType2[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println();

        System.out.println("Using for each loop");
        for(int[] x : twoDArrayType2) {
            for(int y : x) {
                System.out.print(y + "  ");
            }
            System.out.println();
        }


        // Jagged Array
        System.out.println("\nJagged Array");

        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[3];

        for(int i=0; i<jaggedArray.length; i++) {
            for (int j=0; j<jaggedArray[i].length; j++) {
                jaggedArray[i][j] = i + j;
            }
        }

        for(int i=0; i<jaggedArray.length; i++) {
            for (int j=0; j<jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
