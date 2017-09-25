import java.util.Scanner;

public class ExtractABitFromInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int shifter = scan.nextInt();

        int result = 1 << shifter;
        System.out.println(result);
    }
}
