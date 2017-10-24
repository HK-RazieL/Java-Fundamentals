import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P02_StudentsByFirstAndLastName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = reader.readLine().split(" ");
            if (input[0].equals("") || input[0].equals("END")) return;

            Arrays.stream(input).filter(x -> input[0].charAt(0) < input[1].charAt(0)).forEach(x -> System.out.print(x + " "));
        }
    }
}
