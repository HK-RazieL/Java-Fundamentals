import java.util.Scanner;

public class GameOfNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        String[] names = new String[number];
        int[] scores = new int[number];

        for (int i = 0; i < number; i++) {
            names[i] = scan.nextLine();
            scores[i] = Integer.parseInt(scan.nextLine());
        }

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length(); j++) {
                if (names[i].charAt(j) % 2 == 0) {
                    scores[i] += names[i].charAt(j);
                } else {
                    scores[i] -= names[i].charAt(j);
                }
            }
        }

        int highScore = Integer.MIN_VALUE;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = i;
            }
        }
        System.out.printf("The winner is %s - %d points", names[highScore], scores[highScore]);
    }
}
