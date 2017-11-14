import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P01_BitSnow {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = Integer.numberOfLeadingZeros(Integer.toBinaryString(16 - numbers[i]).length());

            numbers[i] = numbers[i - 1] | numbers[i];
            numbers[i - i] = numbers[i - 1] & numbers[i];
        }

        for (int number : numbers) {
            System.out.println(Integer.toBinaryString(number));
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
