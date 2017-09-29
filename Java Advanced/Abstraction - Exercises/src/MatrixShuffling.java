import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] size = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[size[0]][size[1]];
        String temp;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.next();
            }
        }
        scan.nextLine();

        while (true) {
            try {
                String[] command = scan.nextLine().split(" ");

                if (command[0].equals("END")) {
                    break;
                }
                if (command[0].equals("swap") && command.length == 5) {
                    int row1 = Integer.parseInt(command[1]);
                    int col1 = Integer.parseInt(command[2]);
                    int row2 = Integer.parseInt(command[3]);
                    int col2 = Integer.parseInt(command[4]);

                    temp = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = temp;

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Invalid input!");
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid input!");
            }
        }
    }
}
