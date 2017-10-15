import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P08_FindTheSmallestElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputString = reader.readLine().split(" ");
        List<Integer> list = Stream.of(inputString).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> smallest = x -> x.lastIndexOf(Collections.min(x));
        System.out.println(smallest.apply(list));
    }
}
