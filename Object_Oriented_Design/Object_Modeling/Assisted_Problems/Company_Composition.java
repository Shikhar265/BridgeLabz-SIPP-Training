import java.util.*;

// Class to represent an employee
class Employee 
{
    String name;
    int id;

    Employee(String name, int id) 
    {
        this.name = name;
        this.id = id;
    }

    void show() 
    {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

// Class to represent a department which contains employees
class Department 
{
    String deptName;
    ArrayList<Employee> employees;

    Department(String deptName) 
    {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(Employee emp) 
    {
        employees.add(emp);
    }

    void showEmployees() 
    {
        System.out.println("Department: " + deptName);
        for (Employee emp : employees) 
        {
            emp.show();
        }
        System.out.println();
    }
}

// Class to represent a company which has departments (composition)
class Company 
{
    String compName;
    ArrayList<Department> departments;

    Company(String compName) 
    {
        this.compName = compName;
        this.departments = new ArrayList<>();
    }

    void addDepartment(Department dept) 
    {
        departments.add(dept);
    }

    void showCompanyStructure() 
    {
        System.out.println("\n--- Company: " + compName + " ---");
        for (Department dept : departments) 
        {
            dept.showEmployees();
        }
    }
}

// Main class to test the company structure
public class Company_Composition 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter company name: ");
        String compName = sc.nextLine();

        Company company = new Company(compName);

        System.out.print("Enter number of departments: ");
        int numDepts = sc.nextInt();
        sc.nextLine();  // clear newline

        for (int i = 1; i <= numDepts; i++) 
        {
            System.out.print("Enter name of department " + i + ": ");
            String deptName = sc.nextLine();

            Department dept = new Department(deptName);

            System.out.print("Enter number of employees in " + deptName + ": ");
            int numEmps = sc.nextInt();
            sc.nextLine();  // clear newline

            for (int j = 1; j <= numEmps; j++) 
            {
                System.out.print("Enter name of employee " + j + ": ");
                String empName = sc.nextLine();

                System.out.print("Enter ID of " + empName + ": ");
                int empId = sc.nextInt();
                sc.nextLine();  // clear newline

                dept.addEmployee(new Employee(empName, empId));
            }

            company.addDepartment(dept);
        }

        company.showCompanyStructure();
    }
}
