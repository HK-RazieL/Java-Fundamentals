package p05_border_control;

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
            if (input.length == 3) {
                individual = new Person(input[0], Integer.parseInt(input[1]), input[2]);
            } else {
                individual = new Robot(input[0], input[1]);
            }
            list.add(individual);
        }

        String ending = reader.readLine();

        for (Individual s : list) {
            if (s.getId().endsWith(ending)){
                System.out.println(s.getId());
            }
        }
    }
}
