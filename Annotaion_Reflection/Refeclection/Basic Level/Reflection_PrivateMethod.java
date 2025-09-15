import java.lang.reflect.*;
import java.util.Scanner;

class Calculator {
    private int multiply(int a, int b) { return a * b; }
}

public class Reflection_PrivateMethod {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);

        int result = (int) method.invoke(calc, a, b);
        System.out.println("Multiplication Result: " + result);
        sc.close();
    }
}
