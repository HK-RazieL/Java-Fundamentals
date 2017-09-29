import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int amount = Integer.parseInt(scan.nextLine());
        String[] names = new String[amount];
        int[] scores = new int[amount];
        Character[] vowels = new Character[] {'a', 'u', 'i', 'e', 'o', 'A', 'E', 'I', 'O', 'U'};

        for (int i = 0; i < amount; i++) {
            names[i] = scan.nextLine();

        }

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length(); j++) {
                if (Arrays.asList(vowels).contains(names[i].charAt(j))) {
                    scores[i] += names[i].charAt(j) * names[i].length();
                } else {
                    scores[i] += names[i].charAt(j) / names[i].length();
                }
            }
        }
        Arrays.sort(scores);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);

        }
    }
}
