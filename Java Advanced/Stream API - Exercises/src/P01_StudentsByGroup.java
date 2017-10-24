import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01_StudentsByGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        while (true) {
            String[] input = reader.readLine().split(" ");
            if (input[0].equals("END") || input[0].equals("")) break;

            Arrays.stream(input).filter(x -> input[2].equals("2")).map(x -> input[0] + " " + input[1]).distinct().sorted().forEach(list::add);
        }

        list.stream().sorted().forEach(System.out::println);
    }
}
