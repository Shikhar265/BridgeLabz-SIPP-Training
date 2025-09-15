import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.Scanner;

// Step 1: Define class-level annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value(); // allowed role
}

// Step 2: Service class with restricted method
class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("✅ User deleted successfully!");
    }

    @RoleAllowed("ADMIN")
    public void generateReport() {
        System.out.println("✅ Report generated successfully!");
    }

    public void viewDashboard() {
        System.out.println("Viewing dashboard...");
    }
}

// Step 3: Main program with user role input
public class RoleAllowed_Example {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        AdminService service = new AdminService();

        System.out.print("Enter your role: ");
        String userRole = sc.nextLine();

        System.out.println("Available methods: deleteUser, generateReport, viewDashboard");
        System.out.print("Enter method to execute: ");
        String methodName = sc.nextLine();

        try {
            Method method = AdminService.class.getMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed ra = method.getAnnotation(RoleAllowed.class);

                if (ra.value().equalsIgnoreCase(userRole)) {
                    method.invoke(service);
                } else {
                    System.out.println("❌ Access Denied! Your role: " + userRole);
                }
            } else {
                // method without role restriction
                method.invoke(service);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("❌ Method not found!");
        }

        sc.close();
    }
}
