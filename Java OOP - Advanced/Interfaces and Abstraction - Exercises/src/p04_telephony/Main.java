package p04_telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Smartphone phone = new Smartphone();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] calls = reader.readLine().split("\\s+");
        for (String call : calls) {
            if (call.matches("\\d+")){
                System.out.println(phone.callPhone(call));
            } else {
                System.out.println("Invalid number!");
            }
        }

        String[] sites = reader.readLine().split("\\s+");
        for (String site : sites) {
            if (site.matches("(\\w+:\\/\\/)([a-zA-Z]+)\\.*\\w+([0-9]+)\\w+\\.\\w+")) {
                System.out.println("Invalid URL!");
            } else {
                System.out.println(phone.browseSite(site));
            }
        }
    }
}
