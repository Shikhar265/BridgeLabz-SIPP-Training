import java.util.*;

// Class representing a Subject with name and marks
class Subject {
    String name;
    int marks;

    Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

// Class representing a Student who has a list of subjects (Aggregation)
class Student {
    String name;
    int rollNo;
    List<Subject> subjects;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = new ArrayList<>();
    }

    void addSubject(String subName, int marks) {
        subjects.add(new Subject(subName, marks));
    }

    void displaySubjects() {
        for (Subject s : subjects) {
            System.out.println(s.name + ": " + s.marks);
        }
    }
}

// Class responsible for calculating grade (Service-like behavior)
class GradeCalculator {
    static String calculateGrade(Student student) {
        int total = 0;
        for (Subject s : student.subjects) {
            total += s.marks;
        }
        double average = (double) total / student.subjects.size();

        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 60) return "C";
        else if (average >= 40) return "D";
        else return "F";
    }
}

// Main class
public class School_Result_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        Student student = new Student(name, roll);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 0; i < n; i++) {
            System.out.print("Enter subject name: ");
            String sub = sc.nextLine();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); // clear buffer
            student.addSubject(sub, marks);
        }

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.name);
        System.out.println("Roll No: " + student.rollNo);
        student.displaySubjects();

        String grade = GradeCalculator.calculateGrade(student);
        System.out.println("Grade: " + grade);
    }
}
