package learningarrays;

import java.util.Arrays;

public class StudentChallengeMatrixMultiplication {
    public static void main(String[] args) {

        int[][] matrix1 = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
        int[][] matrix2 = {{1, 5, 2}, {6, 8, 4}, {3, 9, 7}};

        // Adding 2 matrices
        int[][] addedMatrix = new int[3][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                addedMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Added Matrix");
        for (int[] x : addedMatrix) {
            for (int y : x) {
                System.out.print(y + "  ");
            }
            System.out.println();
        }

        // multiplying 2 matrices
        int[][] multipliedMatrix = new int[3][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                multipliedMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        System.out.println("\nMultiplied Matrix");
        for (int[] x : multipliedMatrix) {
            for (int y : x) {
                System.out.print(y + "  ");
            }
            System.out.println();
        }


        // Sorting array of strings.
        String[] languages = {"Java", "Python", "C", "C++", "JavaScript", "Ruby", "Go", "Rust", "Kotlin", "Swift"};

        Arrays.sort(languages);
        System.out.println("\nSorted Array of Strings");
        for (String x : languages) {
            System.out.print(x + "  ");
        }

    }

}
