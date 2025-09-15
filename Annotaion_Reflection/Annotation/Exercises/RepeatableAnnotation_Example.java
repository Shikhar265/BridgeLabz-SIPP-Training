import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.Scanner;

// Step 1: Define container annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

// Step 2: Define repeatable annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

// Step 3: Apply annotation to methods
class SoftwareModule {

    @BugReport(description = "NullPointerException when input is null")
    @BugReport(description = "Slow response on large data")
    public void processData() {
        System.out.println("Processing data...");
    }

    @BugReport(description = "UI alignment issue on mobile screen")
    public void renderUI() {
        System.out.println("Rendering UI...");
    }
}

public class RepeatableAnnotation_Example {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SoftwareModule module = new SoftwareModule();

        System.out.println("Available methods: processData, renderUI");
        System.out.print("Enter method name to see its bug reports: ");
        String methodName = sc.nextLine();

        Method method = null;
        try {
            method = SoftwareModule.class.getMethod(methodName);
        } catch (NoSuchMethodException e) {
            System.out.println("❌ Method not found!");
            sc.close();
            return;
        }

        // Fetch repeatable annotations
        BugReport[] reports = method.getAnnotationsByType(BugReport.class);

        if (reports.length > 0) {
            System.out.println("🐞 Bug Reports for " + methodName + ":");
            for (BugReport report : reports) {
                System.out.println("- " + report.description());
            }
        } else {
            System.out.println("✅ No bug reports found for " + methodName);
        }

        sc.close();
    }
}
