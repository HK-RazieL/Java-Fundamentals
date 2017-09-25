import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] size = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[size[0]][size[1]];
        int sum = 0;
        int highestSum = 0;
        int[][] best = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] +
                        matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2] +
                        matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];

                if (sum > highestSum) {
                    highestSum = sum;
                    best[0][0] = matrix[i][j];
                    best[0][1] = matrix[i][j + 1];
                    best[0][2] = matrix[i][j + 2];
                    best[1][0] = matrix[i + 1][j];
                    best[1][1] = matrix[i + 1][j + 1];
                    best[1][2] = matrix[i + 1][j + 2];
                    best[2][0] = matrix[i + 2][j];
                    best[2][1] = matrix[i + 2][j + 1];
                    best[2][2] = matrix[i + 2][j + 2];

                }
            }

        }

        System.out.printf("Sum = %d\n", highestSum);
        for (int i = 0; i < best.length; i++) {
            for (int j = 0; j < best[i].length; j++) {
                System.out.print(best[i][j] + " ");
            }
            System.out.println();
        }
    }
}
