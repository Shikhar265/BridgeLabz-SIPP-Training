import java.io.*;

public class Checked_Exception
{
    public static void main(String[] args)
    {
        File file = new File("data.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            System.out.println("Contents of data.txt:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
