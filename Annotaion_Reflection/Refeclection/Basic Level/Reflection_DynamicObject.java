import java.lang.reflect.*;
import java.util.Scanner;

class Student {
    String name = "Default Student";
}

public class Reflection_DynamicObject {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter class name to instantiate (e.g., Student): ");
        String className = sc.nextLine();

        Class<?> clazz = Class.forName(className);
        Object obj = clazz.getDeclaredConstructor().newInstance();

        System.out.println("Created Object: " + obj.getClass().getName());
        sc.close();
    }
}
