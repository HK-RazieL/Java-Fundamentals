import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int rows = matrixSize[0];
        int columns = matrixSize[1];

        int[][] matrix = new int[rows][columns];
        int[][] winner = new int[2][2];

        int highestScore = 0;

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {

                int currentScore = 0;
                currentScore += matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1];
                if (currentScore > highestScore) {
                    highestScore = currentScore;
                    winner[0][0] = matrix[i][j];
                    winner[0][1] = matrix[i][j+1];
                    winner[1][0] = matrix[i+1][j];
                    winner[1][1] = matrix[i+1][j+1];
                }
            }

        }

        for (int i = 0; i < winner.length; i++) {
            for (int j = 0; j < winner[i].length; j++) {
                System.out.print(winner[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(highestScore);
    }
}
