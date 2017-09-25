import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        String aBinary = Integer.toBinaryString(a);

        System.out.printf("|%-10s|%10s|%10.2f|%-10.3f|", Integer.toHexString(a).toUpperCase(), (("0000000000" + aBinary).substring(aBinary.length())),b,c);
    }
}
