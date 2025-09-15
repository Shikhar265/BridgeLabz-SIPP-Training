import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

// Step 1: Define annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

// Step 2: Service class with expensive computation
class MathService {

    private Map<Integer, Long> cache = new HashMap<>(); // cache for results

    @CacheResult
    public long factorial(int n) {
        if (cache.containsKey(n)) {
            System.out.println("✅ Returning cached result for " + n);
            return cache.get(n);
        }

        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;

        cache.put(n, result);
        System.out.println("✅ Computed factorial for " + n);
        return result;
    }
}

// Step 3: Main program with user input
public class CacheResult_Example {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MathService service = new MathService();

        while (true) {
            System.out.print("Enter a number to calculate factorial (-1 to exit): ");
            int n = sc.nextInt();
            if (n == -1) break;

            Method method = MathService.class.getMethod("factorial", int.class);
            if (method.isAnnotationPresent(CacheResult.class)) {
                long result = (long) method.invoke(service, n);
                System.out.println("Factorial of " + n + " = " + result + "\n");
            } else {
                System.out.println("❌ Method not annotated with @CacheResult.");
            }
        }

        System.out.println("Exiting program...");
        sc.close();
    }
}
