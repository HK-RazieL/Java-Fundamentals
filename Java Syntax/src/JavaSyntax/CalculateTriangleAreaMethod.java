package JavaSyntax;

        import java.util.Scanner;

public class CalculateTriangleAreaMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        System.out.printf("Area = %.2f", Area(base,height));
    }

    static double Area (double base, double height){
        return (base * height) / 2;
    }
}
