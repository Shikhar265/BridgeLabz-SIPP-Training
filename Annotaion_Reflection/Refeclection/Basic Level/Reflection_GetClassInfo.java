import java.lang.reflect.*;
import java.util.Scanner;

public class Reflection_GetClassInfo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fully qualified class name (e.g., java.util.ArrayList): ");
        String className = sc.nextLine();

        Class<?> clazz = Class.forName(className);

        System.out.println("\nClass: " + clazz.getName());

        System.out.println("\nFields:");
        for (Field f : clazz.getDeclaredFields()) System.out.println("  " + f);

        System.out.println("\nMethods:");
        for (Method m : clazz.getDeclaredMethods()) System.out.println("  " + m);

        System.out.println("\nConstructors:");
        for (Constructor<?> c : clazz.getDeclaredConstructors()) System.out.println("  " + c);

        sc.close();
    }
}
