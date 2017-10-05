import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class P01_MatchingBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                stack.push(i);
            } else if (string.charAt(i) == ')') {
                int start = stack.pop();
                String contents = string.substring(start, i + 1);
                System.out.println(contents);
            }

        }

    }
}
