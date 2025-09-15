import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name  = name;
        this.grade = grade;
    }

    String getName() {
        return name;
    }

    String getGrade() {
        return grade;
    }
}

public class Student_Result_Grouping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // List to store students
        List<Student> students = new ArrayList<>();

        // Take student input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter grade of " + name + ": ");
            String grade = sc.nextLine();

            students.add(new Student(name, grade));
        }

        // Group students by grade and collect names
        Map<String, List<String>> grouped = students.stream()
            .collect(Collectors.groupingBy(
                Student::getGrade,
                Collectors.mapping(Student::getName, Collectors.toList())
            ));

        // Display result
        System.out.println("\nStudents grouped by grade:");
        grouped.forEach((grade, names) -> 
            System.out.println("Grade " + grade + " -> " + names)
        );

        sc.close();
    }
}
