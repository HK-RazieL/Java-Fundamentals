import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P04_ParkingLot {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> set = new HashSet<>();

        while (true) {
            String[] line = reader.readLine().split(", ");

            switch (line[0]) {
                case "IN":
                    set.add(line[1]);
                    break;
                case "OUT":
                    set.remove(line[1]);
                    break;
                case "END":
                if(set.size() > 0) {
                    for (String s : set) {
                        System.out.println(s);
                    }
                } else {
                    System.out.println("Parking Lot is Empty");
                }
                    return;
            }
        }
    }
}

