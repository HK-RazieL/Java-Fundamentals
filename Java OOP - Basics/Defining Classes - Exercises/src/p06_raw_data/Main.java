package p06_raw_data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        List<Car> cars = new LinkedList<>();


        for (int i = 0; i < number; i++) {
            String[] input = reader.readLine().split("\\s+");
            Car car = new Car(input[0],
                    new Engine(Integer.parseInt(input[2])),
                    new Cargo(input[4]),
                    new Tyres(new double[]{ Double.parseDouble(input[5]), Double.parseDouble(input[7]), Double.parseDouble(input[9]), Double.parseDouble(input[11]) }));

            cars.add(car);
        }

        String command = reader.readLine();
        if (command.equalsIgnoreCase("fragile")) {
            cars.stream()
                    .filter(x -> x.getCargo().getCargoType().equalsIgnoreCase(command) && Arrays.stream(x.getTyres().getTyrePressure()).anyMatch(y -> y < 1))
                    .forEach(x -> System.out.println(x.getModel()));
        } else {
            cars.stream()
                    .filter(x -> x.getCargo().getCargoType().equalsIgnoreCase(command) && x.getEngine().getEnginePower() > 250).forEach(x -> System.out.println(x.getModel()));

        }
    }
}
