import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstWord = scan.next();
        String secondWord = scan.next();
        int firstNumber = scan.nextInt();
        double secondNumber = scan.nextDouble();
        double thirdNumber = scan.nextDouble();
        String thirdWord = scan.next();

        System.out.printf("%s %s %s %.0f", firstWord, secondWord, thirdWord, firstNumber + secondNumber + thirdNumber);
    }
}
