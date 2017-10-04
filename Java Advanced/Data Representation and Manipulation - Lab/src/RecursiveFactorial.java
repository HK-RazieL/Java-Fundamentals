import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        System.out.println(factorial(number));

    }
    public static int factorial (int number) {
        if (number == 0){ return 1; }
        return number * factorial(number - 1);
    }
}
