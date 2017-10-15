import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class P01_ConsumerPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        Consumer<String> consumer = x -> System.out.println(x);

        for (int i = 0; i < input.length; i++) {
            consumer.accept(input[i]);
        }
    }
}
