import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P05_AppliedArithmetics {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        while (true) {
            String command = reader.readLine();
            switch (command) {
                case "add":
                    arr = Arrays.stream(arr).map(x -> x + 1).toArray();
                    break;
                case "multiply":
                    arr = Arrays.stream(arr).map(x -> x * 2).toArray();
                    break;
                case "subtract":
                    arr = Arrays.stream(arr).map(x -> x - 1).toArray();
                    break;
                case "print":
                    System.out.println(Arrays.toString(arr).replace("[", ""). replace("]", ""). replace(",",""));
                    break;
                case "end":
                    return;
            }
        }
    }
}
