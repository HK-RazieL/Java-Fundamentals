import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] command = scan.nextLine().split(", ");
        int size = Integer.parseInt(command[0]);
        String mode = command[1];
        int[][] matrix = new int[size][size];
        int counter = 1;

        if (mode.equals("A")) {
            for (int i = 0; i < matrix.length; i++) {
                int secondCounter = counter;

                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = secondCounter;
                    secondCounter += size;
                }
                counter++;
            }
        } else if (mode.equals("B")) {
            for (int i = 0; i < size; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < size; j++) {
                        matrix[j][i] = counter;
                        counter++;
                    }
                } else {
                    for (int j = size - 1; j >= 0; j--) {
                        matrix[j][i] = counter;
                        counter++;

                    }
                }
            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}
