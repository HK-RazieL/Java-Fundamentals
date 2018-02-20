package p09_collection_hierarchy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = reader.readLine().split("\\s+");
        int secondLine = Integer.parseInt(reader.readLine());

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyList myList = new MyList();

        for (String s : firstLine) {
            addCollection.Add(s);

        }
        System.out.println(addCollection.Print());

        for (String s : firstLine) {
            addRemoveCollection.Add(s);
        }
        System.out.println(addRemoveCollection.PrintAdd());

        for (String s : firstLine) {
            myList.Add(s);
        }
        System.out.println(myList.PrintAdd());

        for (int i = 0; i < secondLine; i++) {
            addRemoveCollection.Remove();
        }
        System.out.println(addRemoveCollection.PrintRemove());

        for (int i = 0; i < secondLine; i++) {
            myList.Remove();
        }

        System.out.println(myList.PrintRemove());

    }
}
