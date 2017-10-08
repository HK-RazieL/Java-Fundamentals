import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class P01_SortEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = Arrays.stream(reader.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        for (int i : arr) {
            list.add(i);
        }
        list.removeIf(n -> n % 2 != 0);

        System.out.println(Arrays.asList(list).toString().replaceAll("[\\[\\]]", ""));
        list.sort((n, m) -> n.compareTo(m));
        System.out.println(Arrays.asList(list).toString().replaceAll("[\\[\\]]", ""));

    }
}
