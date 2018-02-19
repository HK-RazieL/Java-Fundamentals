package p06_birthday_celebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Individual> list = new ArrayList<>();

        while (true) {
            String[] input = reader.readLine().split("\\s+");
            if (input[0].equalsIgnoreCase("end")) break;
            Individual individual;
            if (input[0].equalsIgnoreCase("Citizen")) {
                individual = new Person(input[1], Integer.parseInt(input[2]), Long.parseLong(input[3]), input[4]);
            } else if (input[0].equalsIgnoreCase("Robot")){
                individual = new Robot(input[1], Long.parseLong(input[2]));
            } else {
                individual = new Pet(input[1], input[2]);
            }
            list.add(individual);
        }

        String year = reader.readLine();

        for (Individual s : list) {
            if (s.getBirthday() != null) {
                if (s.getBirthday().endsWith(year)) {
                    System.out.println(s.getBirthday());
                }
            }
        }
    }
}
