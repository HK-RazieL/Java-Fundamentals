import java.util.Scanner;

public class CollectTheCoins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] matrix = new char[4][];
        char symbol = 'a';
        int coins = 0;
        int walls = 0;
        int row = 0;
        int col = 0;

        for (int i = 0; i < 4; i++) {
            matrix[i] = scan.nextLine().toCharArray();
        }

        char[] commands = scan.nextLine().toCharArray();

        for (int i = 0; i < commands.length; i++) {
            try {
                switch (commands[i]) {
                    case '>':
                        col++;
                        symbol = matrix[row][col];
                        if (symbol == '$') {
                            coins++;
                        }
                        break;
                    case '<':
                        col--;
                        symbol = matrix[row][col];
                        if (symbol == '$') {
                            coins++;
                        }
                        break;
                    case '^':
                        row--;
                        symbol = matrix[row][col];
                        if (symbol == '$') {
                            coins++;
                        }
                        break;
                    case 'V':
                        row++;
                        symbol = matrix[row][col];
                        if (symbol == '$') {
                            coins++;
                        }
                        break;

                }
            } catch (IndexOutOfBoundsException e) {
                walls++;
                if (commands[i] == '>') {
                    col--;
                } else if (commands[i] == '<') {
                    col++;
                } else if (commands[i] == '^') {
                    row++;
                } else if (commands[i] == 'V') {
                    row--;
                }
            }
        }
        System.out.printf("Coins = %d \nWalls = %d", coins, walls);
    }
}
