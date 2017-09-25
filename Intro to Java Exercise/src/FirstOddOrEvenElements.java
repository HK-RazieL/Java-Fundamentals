import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[] commands = scan.nextLine().split("\\s+");

        int number = Integer.parseInt(commands[1]);
        String oddEven = commands[2];

        List<Integer> result = new ArrayList<>();

        if (oddEven.equals("odd")) {
            for (int i = 0; i < numbersArray.length; i++) {
                if (numbersArray[i] % 2 != 0) {
                    result.add(numbersArray[i]);
                }
            }
        } else {
            for (int i = 0; i < numbersArray.length; i++) {
                if (numbersArray[i] % 2 == 0) {
                    result.add(numbersArray[i]);
                }
            }
        }

        for (int i = 0; i < Math.min(number, result.size()); i++) {
            System.out.printf("%d ", result.get(i));

        }
    }
}
