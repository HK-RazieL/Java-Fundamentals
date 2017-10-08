import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02_NestedLoopsToRecursion {
    public static int number;
    public static int[] loops;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(reader.readLine());

        loops = new int[number];

        nestedLoops(0);
    }

    public static void nestedLoops(int currentLoop) {
        if (currentLoop == number) {
            printLoops();
            return;
        }

        for (int i = 1; i <= number; i++) {
            loops[currentLoop] = i;
            nestedLoops(currentLoop + 1);
        }
    }

    public static void printLoops() {
        for (int i = 0; i < number; i++) {
            System.out.printf("%d ", loops[i]);
        }
        System.out.println();
    }
}