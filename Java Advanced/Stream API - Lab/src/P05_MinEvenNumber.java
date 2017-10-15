import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

public class P05_MinEvenNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String test = reader.readLine();

        if (test.isEmpty()){
            System.out.println("No match");
            return;
        }

        double[] arr = Arrays.stream(test.split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        OptionalDouble min = Arrays.stream(arr).filter(x -> x % 2 == 0).min();
        if (min.isPresent()) {
            System.out.printf("%.2f", min.getAsDouble());
        } else {
            System.out.println("No match");
        }
    }
}
