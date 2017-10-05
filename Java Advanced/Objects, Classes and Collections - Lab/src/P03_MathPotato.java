import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class P03_MathPotato {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] string = reader.readLine().split(" ");
        int number = Integer.parseInt(reader.readLine());
        int counter = 1;
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String s : string) {
            queue.offer(s);
        }

        while (queue.size() > 1) {
            for (int i = 1; i < number; i++) {
                queue.offer(queue.poll());
            }
            if (isPrime(counter)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            counter++;
        }
        System.out.println("Last is " + queue.poll());

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
