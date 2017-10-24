import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P02_WriteToAFile {
    public static void main(String[] args) {
        String inputPath = "H:\\input.txt";
        String outputPath = "C:\\Users\\Raziel\\Desktop\\output.txt";
        List<Character> symbols = new ArrayList<>();
        Collections.addAll(symbols,',', '.', '!', '?');

        try (InputStream in = new FileInputStream(inputPath);
             OutputStream out = new FileOutputStream(outputPath)) {
            int oneByte;
            while ((oneByte = in.read()) >= 0) {
                if (!symbols.contains((char)oneByte)) {
                    out.write((char)oneByte);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
