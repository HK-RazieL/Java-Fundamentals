import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class P02_HotPotato {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] string = reader.readLine().split(" ");
        int number = Integer.parseInt(reader.readLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String s : string) {
            queue.offer(s);
        }

        while (queue.size() > 1) {
            for (int i = 1; i < number; i++) {
                queue.offer(queue.poll());
            }
                System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());


    }
}
