package p07_food_storage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        Map<String, Buyer> listOfPeople = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String[] input = reader.readLine().split("\\s+");
            Buyer individual;
            if(input.length == 3) {
                individual = new Rebel(input[0], Integer.parseInt(input[1]), input[2]);
            } else {
                individual = new Citizen(input[0], Integer.parseInt(input[1]), Long.parseLong(input[2]), input[3]);
            }
            listOfPeople.put(input[0], individual);
        }

        while (true) {
            String input = reader.readLine();
            if (input.equalsIgnoreCase("end")) break;

            if (listOfPeople.containsKey(input)){
                listOfPeople.get(input).buyFood();
            }
        }

        int sum = 0;

        for (Buyer s : listOfPeople.values()) {
            sum += s.getFood();
        }

        System.out.println(sum);
    }
}
