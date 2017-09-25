import java.util.Arrays;
import java.util.Scanner;

public class SquaresInMatrix2x2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] size = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String[][] matrix = new String[size[0]][size[1]];
        int counter = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.next();
            }
        }

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j].equals(matrix[i][j + 1]) && matrix[i][j + 1].equals(matrix[i + 1][j + 1]) && matrix[i][j].equals(matrix[i + 1][j])){
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
