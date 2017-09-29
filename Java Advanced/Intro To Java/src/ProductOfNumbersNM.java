import java.math.BigInteger;
import java.util.Scanner;

public class ProductOfNumbersNM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        BigInteger result = new BigInteger("1");

        for (int i = firstNumber; i <= secondNumber; i++) {
            BigInteger temp = BigInteger.valueOf(i);
            result = result.multiply(temp);
        }
        System.out.printf("product[%d..%d] = %d", firstNumber, secondNumber, result);
    }
}
