import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P08_BoundedNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] bounds = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int lowerBound = Math.min(bounds[0], bounds[1]);
        int upperBound = Math.max(bounds[0], bounds[1]);

        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        List<Integer> list = new ArrayList<>();
        Arrays.stream(arr).filter(x -> lowerBound <= x && x <= upperBound).forEach(list::add);
        if (list.size() > 0) {
            list.forEach(x -> System.out.print(x + " "));
        }
    }
}
