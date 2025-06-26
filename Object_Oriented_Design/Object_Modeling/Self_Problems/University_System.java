import java.util.*;

// Class representing a Faculty member (can exist independently)
class Faculty {
    String name;
    String designation;

    Faculty(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    void displayFaculty() {
        System.out.println("Faculty: " + name + " (" + designation + ")");
    }
}

// Class representing a Department (part of University - composition)
class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }

    void displayDepartment() {
        System.out.println("Department: " + deptName);
    }
}

// Class representing a University (contains Departments and associated Faculties)
class University {
    String universityName;
    ArrayList<Department> departments;
    ArrayList<Faculty> faculties;

    University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Add department (composition)
    void addDepartment(String name) {
        departments.add(new Department(name));
    }

    // Associate faculty (aggregation)
    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    // Display all university data
    void displayUniversity() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (Department d : departments) {
            d.displayDepartment();
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.displayFaculty();
        }
    }

    // Simulate deletion of university (clears departments only)
    void deleteUniversity() {
        departments.clear(); // departments deleted (composition)
        System.out.println("\nUniversity '" + universityName + "' deleted. Departments removed.");
    }
}

// Main class to test composition and aggregation
public class University_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create university
        System.out.print("Enter university name: ");
        String uniName = sc.nextLine();
        University uni = new University(uniName);

        // Add departments
        System.out.print("Enter number of departments: ");
        int dCount = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < dCount; i++) {
            System.out.print("Enter department name: ");
            String dname = sc.nextLine();
            uni.addDepartment(dname);
        }

        // Create independent faculties and associate with university (aggregation)
        System.out.print("Enter number of faculty members to add: ");
        int fCount = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < fCount; i++) {
            System.out.print("Enter faculty name: ");
            String fname = sc.nextLine();
            System.out.print("Enter designation: ");
            String desig = sc.nextLine();
            Faculty f = new Faculty(fname, desig); // can exist independently
            uni.addFaculty(f);
        }

        // Display current data
        System.out.println();
        uni.displayUniversity();

        // Simulate deletion of university
        uni.deleteUniversity();

        // Faculties still exist and displayed again
        System.out.println("\nFaculty members still exist independently:");
        for (Faculty f : uni.faculties) {
            f.displayFaculty();
        }
    }
}
