import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class P06_AcademyGraduation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, double[]> map = new TreeMap<>();
        int number = Integer.parseInt(reader.readLine());

        for (int i = 0; i < number; i++) {
            String name = reader.readLine();
            double[] scores = Arrays.stream(reader.readLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
            map.put(name,scores);
        }

        for (String key : map.keySet()) {
            double[] values = map.get(key);
            System.out.println(key + " is graduated with " + average((values)));
        }


    }
    public static double average (double[] scores) {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum / scores.length;
    }
}
