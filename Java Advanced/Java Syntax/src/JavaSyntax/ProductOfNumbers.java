package JavaSyntax;

import java.math.BigInteger;
import java.util.Scanner;

public class ProductOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        BigInteger result = BigInteger.ONE;

        for (int i = firstNumber; i <= secondNumber; i++) {
            BigInteger number = new BigInteger("" + i);
            result = result.multiply(number);
        }

        System.out.printf("product[%d..%d] = %d\n", firstNumber,secondNumber,result);
    }
}
