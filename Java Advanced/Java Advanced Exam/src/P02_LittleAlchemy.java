import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class P02_LittleAlchemy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        Arrays.stream(reader.readLine().split(" ")).forEach(x -> queue.add(Integer.parseInt(x)));

        int gold = 0;

        while (true) {
            String[] input = reader.readLine().split(" ");
            if (input[0].equals("Revision") || input[0].equals("")) {
                if (queue.size() > 0) {
                    for (int s : queue) {
                        System.out.print(s + " ");
                    }
                } else {
                    System.out.print("0");
                }
                System.out.println();
                System.out.println(gold);
                return;
            }

            if (input[0].equals("Apply") && input[1].equals("acid") && queue.size() > 0) {
                for (int i = 0; i < Integer.parseInt(input[2]); i++) {
                    if (queue.size() > 0) {
                        if (queue.peek() - 1 > 0) {
                            queue.addLast(queue.peek() - 1);
                            queue.removeFirst();
                        } else {
                            queue.removeFirst();
                            gold++;
                        }
                    }
                }
            }

            if (input[0].equals("Air") && input[1].equals("leak") && gold > 0) {
                gold--;
                queue.addLast(Integer.parseInt(input[2]));
            }
        }
    }
}
