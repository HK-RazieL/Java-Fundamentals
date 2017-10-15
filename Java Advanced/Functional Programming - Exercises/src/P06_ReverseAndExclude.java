import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P06_ReverseAndExclude {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputString = reader.readLine().split(" ");
        List<Integer> list = Stream.of(inputString).map(Integer::parseInt).collect(Collectors.toList());
        int number = Integer.parseInt(reader.readLine());

        Predicate<Integer> test = x -> x % number == 0;
        list.removeIf(test);
        Collections.reverse(list);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}
