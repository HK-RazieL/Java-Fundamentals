import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class P01_ReadFile {
    public static void main(String[] args){
        String path = "H:\\input.txt";

        try (InputStream in = new FileInputStream(path)) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = in.read();
            }
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
