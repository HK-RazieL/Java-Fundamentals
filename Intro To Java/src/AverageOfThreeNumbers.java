import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNumber = scan.nextDouble();
        double secondNumber = scan.nextDouble();
        double thirdNumber = scan.nextDouble();
        System.out.printf("%.2f", (firstNumber + secondNumber + thirdNumber) / 3);
    }
}
