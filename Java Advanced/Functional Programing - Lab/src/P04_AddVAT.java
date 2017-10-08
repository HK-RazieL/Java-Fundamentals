import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.function.Function;

public class P04_AddVAT {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] string = reader.readLine().split(", ");
        Function<String, Double> math = x -> Double.parseDouble(x) * 1.2;

        System.out.println("Prices with VAT:");
        for (String s : string) {
            String result = String.format("%.2f", math.apply(s));
            System.out.println(result.replace('.', ','));
        }

    }
}
