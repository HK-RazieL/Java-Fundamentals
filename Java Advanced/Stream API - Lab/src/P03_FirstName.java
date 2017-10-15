import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class P03_FirstName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        String letters = reader.readLine().toUpperCase();

        Stream<String> stream = Stream.of(input).filter(x -> letters.contains(String.valueOf(x.charAt(0)))).sorted().limit(1);

        if (!stream.findFirst().isPresent()) {
            System.out.println("No match");
        } else {
            Stream.of(input).filter(x -> letters.contains(String.valueOf(x.charAt(0)))).sorted().limit(1).forEach(System.out::print);
        }

    }
}
