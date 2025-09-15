import java.lang.reflect.*;
import java.util.Scanner;

class Configuration {
    private static String API_KEY = "OLD_KEY";
}

public class Reflection_StaticField {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);

        System.out.print("Enter new API_KEY: ");
        String newKey = sc.nextLine();

        field.set(null, newKey);
        System.out.println("Updated API_KEY: " + field.get(null));
        sc.close();
    }
}
