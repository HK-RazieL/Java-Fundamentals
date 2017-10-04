import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveDrawing {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        recursionDown(number);
        recursionUp(number);
    }

    public static void recursionDown (int number) {
        for (int i = 0; i < number; i++) {
            for (int j = number - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void recursionUp (int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
