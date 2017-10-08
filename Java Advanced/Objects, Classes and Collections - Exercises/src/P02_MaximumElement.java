import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P02_MaximumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCommands = Integer.parseInt(reader.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        TreeSet<Integer> maximumNumber = new TreeSet<>();

        while (numberOfCommands > 0) {
            int[] command = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            switch (command[0]) {
                case 1:
                    stack.push(command[1]);
                    maximumNumber.add(command[1]);
                    break;
                case 2:
                    max(maximumNumber, stack);
                    maximumNumber.remove(stack.peek());
                    stack.pop();
                    break;
                case 3:
                    System.out.println(maximumNumber.last());
                    break;
            }
            numberOfCommands--;
        }
    }
    public static void max(TreeSet maximumNumber, ArrayDeque stack) {
        if (stack.peek() == maximumNumber.last()) {
            maximumNumber.remove(stack.peek());
        }
    }
}

