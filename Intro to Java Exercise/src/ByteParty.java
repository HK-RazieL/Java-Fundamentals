import java.util.Scanner;

public class ByteParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int[] numbers = new int[a];

        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(scan.nextLine());
            numbers[i] = b;
        }

        while(true) {
            String[] command = scan.nextLine().split("\\s+");

            if(command[0].equals("party")) {
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println(numbers[i]);

                }
                break;
            }

            int action = Integer.parseInt(command[0]);
            int position = Integer.parseInt(command[1]);

            switch (action) {
                case -1:
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] ^ (1 << position);
                    }
                    break;
                case 0:
                    for (int i = 0; i < numbers.length; i++) {
                        int mask = ~(1 << position);
                        numbers[i] = numbers[i] & mask;
                    }
                    break;
                case 1:
                    for (int i = 0; i < numbers.length; i++) {
                        int mask = 1 << position;
                        numbers[i] = numbers[i] | mask;
                    }
                    break;
            }

        }

    }
}
