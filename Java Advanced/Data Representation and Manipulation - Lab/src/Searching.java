import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Searching {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(reader.readLine());
        boolean test = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.print(i);
                test = true;
            } else if (i == arr.length - 1 && arr[i] != number && !test) {
                System.out.print(-1);
            }
        }
    }
}
