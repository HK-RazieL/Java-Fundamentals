import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.Comparator.comparingInt;

public class P03_VLogger {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, HashSet<String>> following = new HashMap<>();

        while (true) {
            String[] input = reader.readLine().split(" ");
            if (input[0].equals("Statistics")) {
                System.out.printf("The V-Logger has a total of %d vloggers in its logs.\n", map.size());
                int counter = 0;
                for (Map.Entry<String, HashSet<String>> s : map.entrySet()) {
                    counter++;
                    System.out.printf(counter + ". " + s.getKey() + " : %d followers, %d following\n", s.getValue().size(), following.get(s.getKey()).size() );

                    if (s.getValue().size() > 0) {
                        for (int i = 0; i < s.getValue().size(); i++) {
                            Iterator<String> value = s.getValue().iterator();
                            if (value.hasNext()) {
                                String code = value.next();
                                System.out.printf("* %s\n", code);
                            }

                        }
                    }
                }
                return;
            }

            switch (input[1]) {
                case "joined":
                    if (!map.containsKey(input[0])) {
                        map.put(input[0], new HashSet<>());
                        following.put(input[0], new HashSet<>());
                    }
                    break;
                case "followed":
                    if (map.containsKey(input[2]) && !input[0].equals(input[2]) && !map.get(input[0]).contains(input[2])) {
                        map.get(input[2]).add(input[0]);
                        following.get(input[0]).add(input[2]);
                    }
                    break;
            }

        }
    }
}
