import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseTags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("(<\\w+>)([\\w+\\s*]*)(<\\/\\w+>)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            input = input.replace(matcher.group(0), matcher.group(2).toUpperCase());
        }
        System.out.println(input);
    }
}
