package p03_opinion_poll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();

        int number = Integer.parseInt(reader.readLine());
        for (int i = 0; i < number; i++) {
            String[] inputs = reader.readLine().split(" ");
            Person person = new Person(inputs[0], Integer.valueOf(inputs[1]));
            people.add(person);
        }

        people.stream().filter(x -> x.getAge() > 30).sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
    }
}
