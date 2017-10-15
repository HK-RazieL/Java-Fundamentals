import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P09_CustomComparator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] arrayEven = Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
        int[] arrayOdd = Arrays.stream(arr).filter(x -> x % 2 != 0).toArray();

        Arrays.sort(arrayEven);
        Arrays.sort(arrayOdd);

        for (int i : arrayEven) {
            System.out.print(i + " ");
        }
        for (int i : arrayOdd) {
            System.out.print(i + " ");
        }

    }
}
