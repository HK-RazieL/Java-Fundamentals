package p10_mood_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split("\\s\\|\\s");

        if (line[1].equalsIgnoreCase("demon")) {
            Characters character = new Demon(line[0], line[1], Double.parseDouble(line[2]), Integer.parseInt(line[3]));
            System.out.println(character.toString());
        } else {
            Characters character = new Archangel(line[0], line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3]));
            System.out.println(character.toString());
        }
    }
}
