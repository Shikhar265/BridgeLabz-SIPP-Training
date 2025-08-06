import java.io.*;

public class Try_With_Resources
{
    public static void main(String[] args)
    {
        // Try-with-resources block ensures BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt")))
        {
            String line = br.readLine();
            System.out.println("First line: " + line);
        }
        catch (IOException e)
        {
            System.out.println("Error reading file");
        }
    }
}
