import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();

        long[][] triangle = new long[lines][lines];

        for (int i = 0; i < lines; i++) {
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            if(i > 1) {
                for (int j = 1; j < i; j++) {
                    long[] previousRow = triangle[i - 1];
                    long previousRowSum = previousRow[j] + previousRow[j - 1];
                    triangle[i][j] = previousRowSum;

                }
            }
        }

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (triangle[i][j] != 0) {
                    System.out.print(triangle[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
