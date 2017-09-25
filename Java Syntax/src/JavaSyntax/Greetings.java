package JavaSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greetings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstName = reader.readLine();
        String lastName = reader.readLine();

        if (firstName.isEmpty()){
            firstName = "*****";
        }
        if (lastName.isEmpty()){
            lastName = "*****";
        }
        System.out.printf("Hello, %s %s!", firstName, lastName);
    }
}
