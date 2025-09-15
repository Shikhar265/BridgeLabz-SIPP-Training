import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    String getDepartment() {
        return department;
    }

    double getSalary() {
        return salary;
    }
}

public class Employee_Salary_Categorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<Employee> employees = new ArrayList<>();

        // Take employee input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter department of " + name + ": ");
            String dept = sc.nextLine();

            System.out.print("Enter salary of " + name + ": ");
            double salary = sc.nextDouble();
            sc.nextLine(); // consume newline

            employees.add(new Employee(name, dept, salary));
        }

        // Group by department and calculate average salary
        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));

        // Display results
        System.out.println("\nAverage Salary by Department:");
        avgSalaryByDept.forEach((dept, avg) ->
            System.out.println(dept + " -> " + avg)
        );

        sc.close();
    }
}
