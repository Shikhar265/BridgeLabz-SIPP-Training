import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.Scanner;

// Step 1: Define custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

// Step 2: Apply annotation to methods
class ProjectTasks {

    @ImportantMethod(level = "CRITICAL")
    public void deploySystem() {
        System.out.println("Deploying system...");
    }

    @ImportantMethod // uses default HIGH
    public void backupData() {
        System.out.println("Backing up data...");
    }

    public void routineCheck() {
        System.out.println("Performing routine check...");
    }
}

// Step 3: Reflection to retrieve important methods
public class ImportantMethod_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter class name to inspect (e.g., ProjectTasks): ");
        String className = sc.nextLine();

        try {
            Class<?> cls = Class.forName(className);
            Method[] methods = cls.getDeclaredMethods();

            System.out.println("\n⭐ Important Methods in " + className + ":");
            for (Method method : methods) {
                if (method.isAnnotationPresent(ImportantMethod.class)) {
                    ImportantMethod ann = method.getAnnotation(ImportantMethod.class);
                    System.out.println("- " + method.getName() + " (Level: " + ann.level() + ")");
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Class not found!");
        }

        sc.close();
    }
}
