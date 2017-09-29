package JavaSyntax;

import java.io.IOException;
import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        scanner.nextLine();
        String timeOfDay = scanner.nextLine();

        double cost = 0.00;
        double sum = 0.00;

        if(distance < 20 ){
            sum += 0.70;

            switch (timeOfDay){
                case "day":
                    cost = 0.79;
                    break;
                case "night":
                    cost = 0.90;
                    break;
            }
        } else if (distance >= 20 && distance < 100) {
            cost = 0.09;
        } else if (distance >= 100) {
            cost = 0.06;
        }

        sum += distance * cost;

        System.out.printf("%.2f", sum);

    }
}
