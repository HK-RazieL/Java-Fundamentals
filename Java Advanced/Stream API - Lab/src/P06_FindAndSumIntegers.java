import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P06_FindAndSumIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        if (input.isEmpty() || input.equals(" ")){
            System.out.println("No match");
            return;
        }

        String[] arr = input.split(" ");
        int counter = 0;
        for (String s : arr) {
            if (isNumber(s)) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("No match");
            return;
        }

        System.out.println(Arrays.stream(arr).filter(s -> isNumber(s)).map(Integer::parseInt).reduce((x, y) -> x + y).get());

    }

    public static boolean isNumber(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
