import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;

public class P04_FindEvensOrOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String command = reader.readLine();

        Predicate<Integer> evenOrOdd = x -> x % 2 == 0;

        for (int i = arr[0]; i <= arr[1]; i++) {
            switch (command) {
                case "even":
                    if (evenOrOdd.test(i)) {
                        System.out.print(i + " ");
                    }
                    break;
                case "odd":
                    if (!evenOrOdd.test(i)) {
                        System.out.print(i + " ");
                    }
                    break;
            }
        }
    }
}
