import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

public class P04_AverageOfDoubles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String test = reader.readLine();

        if (test.isEmpty()){
            System.out.println("No match");
            return;
        }

        double[] arr = Arrays.stream(test.split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        OptionalDouble average = Arrays.stream(arr).average();
        if (average.isPresent()) {
            System.out.printf("%.2f", average.getAsDouble());
        } else {
            System.out.println("No match");
        }
    }
}
