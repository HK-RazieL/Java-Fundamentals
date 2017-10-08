import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Predicate;

public class P03_CountUppercaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] string = reader.readLine().split(" ");
        Predicate<String> uppercase = x -> Character.isUpperCase(x.charAt(0));
        ArrayList<String> upper = new ArrayList<>();

        for (int i = 0; i < string.length; i++) {
            if (uppercase.test(string[i])) {
                upper.add(string[i]);
            }
        }

        System.out.println(upper.size());
        for (String s : upper) {
            System.out.println(s);
        }

    }
}
