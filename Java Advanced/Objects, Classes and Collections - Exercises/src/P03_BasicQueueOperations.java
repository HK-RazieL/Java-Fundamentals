import com.sun.jmx.remote.internal.ArrayQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class P03_BasicQueueOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>(100);

        fillingStack(input, arr, queue);
        removingFromStack(input, queue);
        findingNumber(input, queue);


    }

    public static void fillingStack(int[] input, int[] arr, ArrayDeque queue) {
        for (int i = 0; i < input[0]; i++) {
            queue.addFirst(arr[i]);
        }
    }

    public static void removingFromStack(int[] input, ArrayDeque queue) {
        for (int i = 0; i < input[1]; i++) {
            queue.removeLast();
        }
    }

    public static void findingNumber(int[] input, ArrayDeque queue) {
        if (queue.contains(input[2])) {
            System.out.println("true");
        } else if (queue.size() == 0) {
            System.out.println(0);
        } else {
            int smallest = Integer.MAX_VALUE;
            for (int i = 0; i < queue.size(); i++) {
                if (Integer.parseInt(queue.peek().toString()) <= smallest) {
                    smallest = Integer.parseInt(queue.poll().toString());
                } else {
                    queue.poll();
                }
            }
            System.out.println(smallest);
        }
    }
}
