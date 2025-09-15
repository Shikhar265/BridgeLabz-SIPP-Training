import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.Scanner;

// Step 1: Define custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

// Step 2: Apply annotation to methods
class DevelopmentTasks {

    @Todo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
    public void loginFeature() {}

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDB() {}

    @Todo(task = "Fix UI responsiveness", assignedTo = "Charlie", priority = "LOW")
    public void fixUI() {}

    public void completedTask() {}
}

// Step 3: Reflection to read annotations
public class TodoAnnotation_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter class name to inspect (e.g., DevelopmentTasks): ");
        String className = sc.nextLine();

        try {
            Class<?> cls = Class.forName(className);
            Method[] methods = cls.getDeclaredMethods();

            System.out.println("\n📝 Pending Tasks in " + className + ":");
            for (Method method : methods) {
                if (method.isAnnotationPresent(Todo.class)) {
                    Todo todo = method.getAnnotation(Todo.class);
                    System.out.println("- Task: " + todo.task());
                    System.out.println("  Assigned To: " + todo.assignedTo());
                    System.out.println("  Priority: " + todo.priority());
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Class not found!");
        }

        sc.close();
    }
}
