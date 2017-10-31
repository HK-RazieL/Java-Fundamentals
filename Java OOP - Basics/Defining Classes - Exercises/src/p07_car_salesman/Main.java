package p07_car_salesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Engine> listOfEngines = new HashMap<>();
        List<Car> listOfCars = new ArrayList<>();

        int numberOfEngines = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numberOfEngines; i++) {
            String[] input = reader.readLine().split("\\s+");
            Engine engine = new Engine();

            switch (input.length) {
                case 2: {
                    engine = new Engine(input[0], Integer.parseInt(input[1]));
                }
                    break;
                case 3:
                    if (input[2].matches("[0-9]+")) {
                        engine = new Engine(input[0], Integer.parseInt(input[1]));
                        engine.setDisplacement(input[2]);
                    } else {
                        engine = new Engine(input[0], Integer.parseInt(input[1]), input[2]);
                    }
                    break;
                case 4:
                    engine = new Engine(input[0], Integer.parseInt(input[1]), input[2], input[3]);
                    break;
            }
            listOfEngines.put(engine.getModel(), engine);
        }

        int numberOfCars = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numberOfCars; i++) {
            String[] input = reader.readLine().split("\\s+");
            Car car = new Car();

            switch (input.length) {
                case 2: {
                    car = new Car(input[0], listOfEngines.get(input[1]));
                }
                break;
                case 3:
                    if (input[2].matches("[0-9]+")) {
                        car = new Car(input[0], listOfEngines.get(input[1]));
                        car.setWeight(input[2]);

                    } else {
                        car = new Car(input[0], listOfEngines.get(input[1]), input[2]);
                    }
                    break;
                case 4:
                    car = new Car(input[0], listOfEngines.get(input[1]), input[2], input[3]);
                    break;
            }
            listOfCars.add(car);

        }

        for (Car cars : listOfCars) {
            System.out.println(cars);
        }


    }
}
