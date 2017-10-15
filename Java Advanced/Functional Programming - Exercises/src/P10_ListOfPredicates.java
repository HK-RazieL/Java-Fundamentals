import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.BiPredicate;

public class P10_ListOfPredicates {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        BiPredicate<Integer, Integer> divisable = (x, y) -> x % y == 0;

        for (int i = 1; i <= number; i++) {
            int counter = 0;

            for (int j = 0; j < arr.length; j++) {
                if (divisable.test(i, arr[j])){
                    counter++;
                }
                if (counter == arr.length){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
