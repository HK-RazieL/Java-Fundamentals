import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class P02_SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] string = reader.readLine().split(", ");
        int sum = 0;
        Function<String, Integer> parse = x -> Integer.parseInt(x);
        for (int i = 0; i < string.length; i++) {
            sum += parse.apply(string[i]);
        }

        System.out.println("Count = " + string.length);
        System.out.println("Sum = " + sum);

    }
}
