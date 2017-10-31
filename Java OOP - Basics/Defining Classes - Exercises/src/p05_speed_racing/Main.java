package p05_speed_racing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        Map<String, Car> cars = new LinkedHashMap<>();

        while (number-- > 0) {
            String[] input = reader.readLine().split("\\s+");
            Car car = new Car(input[0], Double.parseDouble(input[1]), Double.parseDouble(input[2]));

            cars.putIfAbsent(car.getModel(), car);
        }

        while (true) {
            String[] commands = reader.readLine().split("\\s+");
            if (commands[0].equalsIgnoreCase("End")) {
                for (Map.Entry car : cars.entrySet()) {
                    System.out.println(car.getValue().toString());
                }
                break;

            } else if (commands[0].equalsIgnoreCase("drive")) {
                cars.get(commands[1]).drive(Double.parseDouble(commands[2]));
            }

        }
    }
}
