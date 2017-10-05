import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class P05_SoftUniParty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<String> set = new TreeSet<>();

        while (true) {
            String guests = reader.readLine();
            if (guests.equals("PARTY")) {
                while (true) {
                    String remove = reader.readLine();
                    set.remove(remove);
                    if (remove.equals("END")) {
                        System.out.println(set.size());
                        for (String s : set) {
                            System.out.println(s);
                        }
                        return;
                    }
                }
            } else {
                set.add(guests);
            }
        }
    }
}
