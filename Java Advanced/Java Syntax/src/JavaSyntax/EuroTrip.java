package JavaSyntax;

        import java.math.BigDecimal;
        import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wurst = scanner.nextDouble();

        BigDecimal exchangeRate = new BigDecimal("4210500000000" );

        BigDecimal priceInBGN = new BigDecimal(wurst * 1.2);

        BigDecimal result = exchangeRate.multiply(priceInBGN);

        System.out.printf("%.2f marks", result);
    }
}
