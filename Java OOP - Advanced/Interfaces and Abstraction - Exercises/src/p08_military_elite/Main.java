package p08_military_elite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Private> soldiers = new LinkedHashMap<>();

        while (true) {
            String[] input = reader.readLine().split("\\s+");
            Soldier soldier = null;

            switch (input[0]) {
                case "Private":
                    soldier = new Private(Integer.parseInt(input[1]), input[2], input[3], Double.parseDouble(input[4]));
                    soldiers.put(Integer.parseInt(input[1]), (Private)soldier);
                    break;
                case "Spy":
                    soldier = new Spy(Integer.parseInt(input[1]), input[2], input[3], Integer.parseInt(input[4]));
                    break;
                case "LeutenantGeneral":
                    soldier = new LeutenantGeneral(Integer.parseInt(input[1]), input[2], input[3], Double.parseDouble(input[4]));

                    for (int i = 5; i < input.length; i++) {
                        if (soldiers.containsKey(Integer.parseInt(input[i]))) {
                            soldier.addPrivates(soldiers.get(Integer.parseInt(input[i])));
                        }
                    }
                    break;
                case "Engineer":
                    if (input[5].equals("Airforces") || input[5].equals("Marines")) {
                        soldier = new Engineer(Integer.parseInt(input[1]), input[2], input[3], Double.parseDouble(input[4]), input[5]);
                        for (int i = 6; i < input.length; i += 2) {
                            soldier.addRepairs(input[i], Integer.parseInt(input[i + 1]));
                        }
                    }
                    break;
                case "Commando":
                    if (input[5].equals("Airforces") || input[5].equals("Marines")) {
                        soldier = new Commando(Integer.parseInt(input[1]), input[2], input[3], Double.parseDouble(input[4]), input[5]);
                        for (int i = 6; i < input.length; i += 2) {
                            if (input[i + 1].equals("Finished") || input[i + 1].equals("inProgress")) {
                                soldier.addMission(input[i], input[i + 1]);
                            }
                        }
                    }
                    break;
                case "End":
                    return;
            }

            System.out.println(soldier);
        }
    }
}
