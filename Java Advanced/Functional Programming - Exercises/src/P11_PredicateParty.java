import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class P11_PredicateParty {

    private static Predicate<String> currentPredicate;
    private static List<String> list;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        list = new ArrayList<>(Arrays.asList(reader.readLine().split("\\s+")));

        while (true) {
            String[] command = reader.readLine().split(" ");
            String action = command[0];
            if ("Party!".equals(action)){
                break;
            }
            Predicate<String> lengthPredicate = (string) -> string.length() == Integer.parseInt(command[2]);
            Predicate<String> startsWithPredicate = (string) -> string.startsWith(command[2]);
            Predicate<String> endsWithPredicate = (string) -> string.endsWith(command[2]);
            switch (command[1]) {
                case "Length":
                    currentPredicate = lengthPredicate;
                    break;
                case "StartsWith":
                    currentPredicate = startsWithPredicate;
                    break;
                case "EndsWith":
                    currentPredicate = endsWithPredicate;
                    break;
            }
            switch (command[0]) {
                case "Remove":
                    list.removeIf(currentPredicate);
                    break;
                case "Double":
                    doubleArray();
                    break;
            }
        }
        if (list.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(Arrays.toString(list.toArray()).replace("]", "").replace("[", "") + " are going to the party!");
        }
    }

    private static void doubleArray() {
        List<String> result = new ArrayList<>();
        for (String s1 : list) {
            if (currentPredicate.test(s1)) {
                result.add(s1);
            }
            result.add(s1);
        }
        list = result;
    }
}