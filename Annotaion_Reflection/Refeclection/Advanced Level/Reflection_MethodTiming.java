import java.lang.reflect.*;
import java.util.Scanner;

class Task {
    public void heavyTask() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Task finished!");
    }
}

public class Reflection_MethodTiming {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Task task = new Task();

        System.out.print("Enter method name to time (heavyTask): ");
        String methodName = sc.nextLine();

        Method m = Task.class.getMethod(methodName);

        long start = System.nanoTime();
        m.invoke(task);
        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start) / 1_000_000 + " ms");
        sc.close();
    }
}
