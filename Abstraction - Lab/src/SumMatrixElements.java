import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int rows = arr[0];
        int columns = arr[1];

        int[][] matrix = new int[rows][columns];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];

            }

        }

        System.out.println(rows);
        System.out.println(columns);
        System.out.println(sum);
    }
}
