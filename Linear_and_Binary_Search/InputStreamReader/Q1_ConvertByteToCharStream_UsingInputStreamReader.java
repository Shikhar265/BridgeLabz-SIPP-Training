import java.io.*;

public class Q1_ConvertByteToCharStream_UsingInputStreamReader {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            isr.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
