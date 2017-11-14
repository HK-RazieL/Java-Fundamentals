package its_in_the_blood;

import its_in_the_blood.core.HealthManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = reader.readLine().split("\\s+");
            if (input[0].equals("BEER")) {
                break;
            }
            switch (input[0]) {
                case "createOrganism":
                    HealthManager.createOrganism(input[1]);
                    break;
                case "addCluster":
                    HealthManager.addCluster(input[1], input[2], Integer.parseInt(input[3]), Integer.parseInt(input[4]));
                    break;
                case "addCell":
                    HealthManager.addCell(input[1], input[2], input[3], input[4], Integer.parseInt(input[5]), Integer.parseInt(input[6]), Integer.parseInt(input[7]), Integer.parseInt(input[8]));
                    break;
                case "activateCluster":
                    HealthManager.activateCluster(input[1]);
                    break;
                case "checkCondition":
                    HealthManager.checkCondition(input[1]);
                    break;
                default:
                    break;

            }
        }

    }
}
