import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile("<[\\w+=\"-/!\\s+]+>");

        while (true) {
            String command = scan.nextLine();
            Matcher matcher = pattern.matcher(command);

            if (command.equals("END")) {
                break;
            }
            if (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
