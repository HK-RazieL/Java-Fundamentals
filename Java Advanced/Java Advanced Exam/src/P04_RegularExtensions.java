import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04_RegularExtensions {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();


        while (true) {
            String input = reader.readLine();
            StringBuilder sb = new StringBuilder();

            sb.append(input);
            if (input.contains("%")){
               String[] arr = string.split(" ");
                for (int i = 0; i < arr.length; i++) {
                    sb.append(input.replace("%", "")).append("\\w+\\b");
                    Pattern pattern = Pattern.compile(sb.toString());
                    Matcher matcher = pattern.matcher(string);
                    if (matcher.find()){
                        StringBuilder result = new StringBuilder();
                        result.append(arr[i]).reverse();
                        System.out.println(result);
                    }

                }

            }

            if (input.startsWith("Print")) {
                System.out.println(string);
                return;
            } else {
                string = string.replaceFirst(input, sb.reverse().toString());
            }
        }
    }
}
