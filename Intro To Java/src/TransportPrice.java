import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        scan.nextLine();
        String timeOfDay = scan.nextLine();

        double price = 0D;

        if (distance < 20) {
            price += 0.7;
            switch (timeOfDay) {
                case "day":
                    price += distance * 0.79;
                    break;
                case "night":
                    price += distance * 0.9;
                    break;
            }
        } else if (distance >= 20) {
            price += distance * 0.09;
        } else if (distance >= 100) {
            price += distance * 0.06;
        }

        System.out.printf("%.2f", price);
    }
}
