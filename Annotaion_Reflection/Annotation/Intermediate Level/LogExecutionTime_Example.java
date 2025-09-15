import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.Scanner;

// Step 1: Define custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

// Step 2: Apply annotation to methods
class PerformanceTests {

    @LogExecutionTime
    public void heavyComputation() {
        long sum = 0;
        for (long i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        System.out.println("Computation result = " + sum);
    }

    @LogExecutionTime
    public void simulateDelay() {
        try {
            Thread.sleep(500); // simulate half-second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Delay simulation complete.");
    }

    public void quickTask() {
        System.out.println("Quick task executed.");
    }
}

// Step 3: Reflection runner
public class LogExecutionTime_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PerformanceTests tests = new PerformanceTests();

        System.out.println("Available methods: heavyComputation, simulateDelay, quickTask");
        System.out.print("Enter method name to execute: ");
        String methodName = sc.nextLine();

        try {
            Method method = PerformanceTests.class.getMethod(methodName);

            long start = System.nanoTime();
            method.invoke(tests); // invoke method
            long end = System.nanoTime();

            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                System.out.println("⏱ Execution time: " + (end - start) / 1_000_000.0 + " ms");
            } else {
                System.out.println("ℹ️ Method not annotated with @LogExecutionTime.");
            }

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        sc.close();
    }
}
