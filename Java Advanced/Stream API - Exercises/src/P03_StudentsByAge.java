import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P03_StudentsByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        while (true) {
            String[] input = reader.readLine().split(" ");
            if (input[0].equals("") || input[0].equals("END")) break;

            Arrays.stream(input).filter(x -> Integer.parseInt(input[2]) >= 18 && Integer.parseInt(input[2]) <= 24).forEach(x -> System.out.print(x + " "));
            System.out.println();
        }
    }
}
