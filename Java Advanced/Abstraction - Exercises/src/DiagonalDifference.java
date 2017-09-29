import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[][] matrix = new int[size][size];
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scan.nextInt();

            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j <= i; j++) {
                sum += matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = size - 1; j >= 0; j--) {
                if (j == ((size - 1) - i)) {
                    sum2 += matrix[i][j];
                }
            }
        }

        System.out.println(Math.max(sum, sum2) - Math.min(sum, sum2));
    }
}
