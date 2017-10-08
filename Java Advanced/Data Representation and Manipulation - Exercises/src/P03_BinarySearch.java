import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P03_BinarySearch {
    public static int middle = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(reader.readLine());

        System.out.println(binary(arr, number));
    }


    public static int binary(int[] arr, int number) {
        int length = arr.length - 1;
        while (middle <= length) {
            int newMiddle = middle + (length - middle) / 2;
            if (number < arr[newMiddle]) {
                length = newMiddle - 1;
            } else if (number > arr[newMiddle]){
                middle = newMiddle + 1;
            } else {
                return newMiddle;
            }
        }
        return -1;
    }
}

