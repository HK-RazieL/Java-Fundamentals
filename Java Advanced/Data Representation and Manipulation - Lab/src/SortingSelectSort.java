import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class SortingSelectSort {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        for (int i : arr) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());
    }
}
