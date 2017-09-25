import java.util.Scanner;

public class ModifyABit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int shift = scan.nextInt();
        int value = scan.nextInt();

        if (value == 1) {
            number = number | (1 << shift);
        } else {
            number = number & ~(1 << shift);
        }

        System.out.println(number);
    }
}
