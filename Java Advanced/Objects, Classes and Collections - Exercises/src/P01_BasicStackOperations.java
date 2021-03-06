import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class P01_BasicStackOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        fillingStack(input, arr, stack);
        removingFromStack(input, stack);
        findingNumber(input, stack);


    }

    public static void fillingStack(int[] input, int[] arr, ArrayDeque stack) {
        for (int i = 0; i < input[0]; i++) {
            stack.push(arr[i]);
        }
    }

    public static void removingFromStack(int[] input, ArrayDeque stack) {
        for (int i = 0; i < input[1]; i++) {
            stack.pop();
        }
    }

    public static void findingNumber(int[] input, ArrayDeque stack) {
        if (stack.contains(input[2])) {
            System.out.println("true");
        } else if (stack.size() == 0) {
            System.out.println(0);
        } else {
            int smallest = Integer.MAX_VALUE;
            for (int i = 0; i < stack.size(); i++) {
                if (Integer.parseInt(stack.peek().toString()) <= smallest) {
                    smallest = Integer.parseInt(stack.pop().toString());
                } else {
                    stack.pop();
                }
            }
            System.out.println(smallest);
        }
    }
}