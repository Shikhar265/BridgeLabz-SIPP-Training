import java.util.*;

// Class representing a Course
class Course {
    String courseName;
    ArrayList<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Add a student to the course
    void addStudent(Student s) {
        students.add(s);
    }

    // Display all students enrolled in this course
    void showEnrolledStudents() {
        System.out.println("Course: " + courseName + " - Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
        System.out.println();
    }
}

// Class representing a Student
class Student {
    String name;
    ArrayList<Course> courses;

    Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Enroll student in a course
    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    // Show all courses the student is enrolled in
    void showCourses() {
        System.out.println("Student: " + name + " - Enrolled in Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
        System.out.println();
    }
}

// Class representing a School that aggregates students
class School {
    String schoolName;
    ArrayList<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Add a student to the school
    void addStudent(Student s) {
        students.add(s);
    }

    // Display all students in the school
    void showStudents() {
        System.out.println("School: " + schoolName + " - Student List:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
        System.out.println();
    }
}

// Main class to run the system
public class School_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create school
        System.out.print("Enter school name: ");
        String schoolName = sc.nextLine();
        School school = new School(schoolName);

        // Create some courses
        HashMap<String, Course> courseMap = new HashMap<>();
        System.out.print("Enter number of available courses: ");
        int courseCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < courseCount; i++) {
            System.out.print("Enter course name: ");
            String courseName = sc.nextLine();
            courseMap.put(courseName, new Course(courseName));
        }

        // Add students and enroll in courses
        System.out.print("Enter number of students to register: ");
        int studentCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter student name: ");
            String studentName = sc.nextLine();
            Student s = new Student(studentName);
            school.addStudent(s);

            System.out.print("Enter number of courses to enroll " + studentName + " in: ");
            int enrollCount = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < enrollCount; j++) {
                System.out.print("Enter course name to enroll: ");
                String cname = sc.nextLine();
                Course c = courseMap.get(cname);
                if (c != null) {
                    s.enroll(c);
                } else {
                    System.out.println("Course " + cname + " not found.");
                }
            }
        }

        // Display all school data
        System.out.println();
        school.showStudents();

        for (Student s : school.students) {
            s.showCourses();
        }

        for (Course c : courseMap.values()) {
            c.showEnrolledStudents();
        }
    }
}
