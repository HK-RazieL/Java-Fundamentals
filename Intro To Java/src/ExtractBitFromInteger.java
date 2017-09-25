import java.util.Scanner;

public class ExtractBitFromInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int shift = scan.nextInt();

        int temp = number >> shift;
        int bit = temp & 1;

        System.out.println(bit);

    }
}
