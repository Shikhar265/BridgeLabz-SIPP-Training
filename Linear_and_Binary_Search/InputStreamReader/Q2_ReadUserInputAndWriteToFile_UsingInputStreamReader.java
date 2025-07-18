import java.io.*;

public class Q2_ReadUserInputAndWriteToFile_UsingInputStreamReader {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter("output.txt");

            String line;
            System.out.println("Enter text (type 'exit' to finish):");

            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(line + "\n");
            }

            fw.close();
            br.close();
            isr.close();

            System.out.println("Input saved to output.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
