import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeriesOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] arr = scan.nextLine().toCharArray();
        List<Character> arr2 = new ArrayList<>();

        arr2.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                arr2.add(arr[i]);
            }
        }

        for (Character c : arr2) {
            System.out.print(c);
        }
    }
}
