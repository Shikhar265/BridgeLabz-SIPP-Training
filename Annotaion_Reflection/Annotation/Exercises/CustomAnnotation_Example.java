import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.Scanner;

// Custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {

    @TaskInfo(priority = "HIGH", assignedTo = "Alice")
    public void completePayment() {
        System.out.println("Completing payment task...");
    }

    @TaskInfo(priority = "MEDIUM", assignedTo = "Bob")
    public void generateReport() {
        System.out.println("Generating report task...");
    }
}

public class CustomAnnotation_Example {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        System.out.println("Available tasks: completePayment, generateReport");
        System.out.print("Enter task name to get its annotation details: ");
        String taskName = sc.nextLine();

        Method method = null;
        try {
            method = TaskManager.class.getMethod(taskName);
        } catch (NoSuchMethodException e) {
            System.out.println("❌ Task not found!");
            sc.close();
            return;
        }

        // Check if annotation is present
        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo info = method.getAnnotation(TaskInfo.class);
            System.out.println("📌 Task Annotation Details:");
            System.out.println("Priority: " + info.priority());
            System.out.println("Assigned To: " + info.assignedTo());
        } else {
            System.out.println("⚠️ No TaskInfo annotation found.");
        }

        sc.close();
    }
}
