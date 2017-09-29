import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigDecimal wurst = new BigDecimal(scan.nextDouble() * 1.2);
        BigDecimal conversion = new BigDecimal("4210500000000");

        System.out.printf("%.2f marks", wurst.multiply(conversion));
    }
}
