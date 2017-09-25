package JavaSyntax;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.next("\\w+");
        String secondWord = scanner.next("\\w+");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        String secondString = scanner.next();

        int sum = firstNumber + secondNumber + thirdNumber;

        System.out.printf("%s %s %s %d", firstWord, secondWord, secondString, sum);
    }
}
