import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.function.Predicate;

public class P07_PredicateForNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        String[] string = reader.readLine().split(" ");

        Predicate<String> length = x -> x.length() <= number;

        for (String s : string) {
            if (length.test(s)) {
                System.out.println(s);
            }
        }
    }
}
