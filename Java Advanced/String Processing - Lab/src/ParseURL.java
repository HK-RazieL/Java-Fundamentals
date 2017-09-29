import java.util.Arrays;
import java.util.Scanner;

public class ParseURL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] reminder = input.split("://");

        if (reminder.length != 2) {
            System.out.println("Invalid URL");


        } else {
            String protocol = reminder[0];
            int serverEndIndex = reminder[1].indexOf("/");
            String server = reminder[1].substring(0, serverEndIndex);
            String resource = reminder[1].substring(serverEndIndex + 1, reminder[1].length());

            System.out.printf("Protocol = %s\n", protocol);
            System.out.printf("Server = %s\n", server);
            System.out.printf("Resources = %s", resource);
        }

    }
}

