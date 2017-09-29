import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(" ");

        String first = line[0];
        String second = line[1];

        int result = 0;

        if (first.length() == second.length()) {
            for (int i = 0; i < first.length(); i++) {
                result += first.charAt(i) * second.charAt(i);
            }
        } else {
            if (first.length() > second.length()) {
                for (int i = 0; i < second.length(); i++) {
                    result += first.charAt(i) * second.charAt(i);
                }
                for (int i = second.length(); i < first.length(); i++) {
                    result += first.charAt(i);
                }
            }

            if (first.length() < second.length()) {
                for (int i = 0; i < first.length(); i++) {
                    result += first.charAt(i) * second.charAt(i);
                }
                for (int i = first.length(); i < second.length(); i++) {
                    result += second.charAt(i);
                }
            }
        }

        System.out.println(result);
    }
}
