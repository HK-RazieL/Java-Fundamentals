import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

public class P05_FilterByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String[] input = reader.readLine().split(", ");
            if (!map.containsKey(input[0])) {
                map.put(input[0], Integer.parseInt(input[1]));
            }
        }
        String condition = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        String[] info = reader.readLine().split(" ");

        Predicate<Integer> checkOlder = x -> x >= age;
        Predicate<Integer> checkYounger = x -> x < age;

        if (condition.equals("older")) {
            for (Map.Entry<String, Integer> s : map.entrySet()) {
                if (checkOlder.test(s.getValue())) {
                    if (info.length > 1 ) {
                        System.out.printf("%s - %d \n",s.getKey(), s.getValue());
                    } else if (info[0].equals("age")) {
                        System.out.println(s.getValue());
                    } else if (info[0].equals("name")) {
                        System.out.println(s.getKey());
                    }
                }
            }
        } else if (condition.equals("younger")) {
            for (Map.Entry<String, Integer> s : map.entrySet()) {
                if (checkYounger.test(s.getValue())) {
                    if (info.length > 1 ) {
                        System.out.printf("%s - %d \n",s.getKey(), s.getValue());
                    } else if (info[0].equals("age")) {
                        System.out.println(s.getValue());
                    } else if (info[0].equals("name")) {
                        System.out.println(s.getKey());
                    }
                }
            }
        }
    }
}
