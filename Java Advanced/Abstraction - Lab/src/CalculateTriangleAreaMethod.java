import java.util.Scanner;

public class CalculateTriangleAreaMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double base = scan.nextDouble();
        double height = scan.nextDouble();
        System.out.printf("Area = %.2f", calculation(base, height));


    }

    public static double calculation (double base, double height) {
        return (base * height) / 2;
    }
}
