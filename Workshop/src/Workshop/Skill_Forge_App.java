package Workshop;

import java.util.*;

//Interface for certificate generation
interface ICertifiable {
 String generateCertificate();
}

//Abstract user class
abstract class User {
 protected String name;
 protected String email;

 public User(String name, String email) {
     this.name = name;
     this.email = email;
 }

 public abstract void displayInfo();
}

//Instructor class
class Instructor extends User {
 public Instructor(String name, String email) {
     super(name, email);
 }

 @Override
 public void displayInfo() {
     System.out.println("Instructor: " + name + ", Email: " + email);
 }
}

//Course class
class Course {
 private String title;
 private Instructor instructor;
 private double rating;
 private String[] modules;
 private final String[] reviews;

 public Course(String title, Instructor instructor, String[] modules) {
     this.title = title;
     this.instructor = instructor;
     this.modules = modules;
     this.rating = 0.0;
     this.reviews = new String[] { "Well explained", "Interactive content" };
 }

 public String getTitle() {
     return title;
 }

 public String[] getModules() {
     return modules;
 }

 protected double getRating() {
     return rating;
 }

 public void setRating(double r) {
     if (r >= 0 && r <= 5) {
         this.rating = r;
     }
 }

 public void displayReviews() {
     System.out.println("Internal Reviews (Read-Only):");
     for (String review : reviews) {
         System.out.println("- " + review);
     }
 }

 public String certificateFormat() {
     return modules.length > 5 ? "Advanced Course Certificate" : "Basic Course Certificate";
 }
}

//Student class
class Student extends User implements ICertifiable {
 private Course course;
 private double progress;
 private char grade;

 public Student(String name, String email) {
     super(name, email);
 }

 public void enroll(Course course) {
     this.course = course;
     this.progress = 0;
     System.out.println(name + " enrolled in: " + course.getTitle());
 }

 public void updateProgress(double percent) {
     this.progress = Math.min(100, this.progress + percent);
     System.out.println("Progress updated to: " + this.progress + "%");
 }

 public void setGrade(char grade) {
     this.grade = grade;
 }

 @Override
 public String generateCertificate() {
     if (progress >= 100) {
         return "🎓 Certificate awarded to " + name + " for completing " + course.getTitle() +
                " [Grade: " + grade + "]";
     } else {
         return "❌ Course incomplete. Progress: " + progress + "%";
     }
 }

 @Override
 public void displayInfo() {
     System.out.println("Student: " + name + ", Email: " + email);
 }
}

//Main class
public class Skill_Forge_App {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Create instructor
     System.out.println("Enter Instructor Details:");
     System.out.print("Name: ");
     String instrName = sc.nextLine();
     System.out.print("Email: ");
     String instrEmail = sc.nextLine();
     Instructor instructor = new Instructor(instrName, instrEmail);

     // Create course
     System.out.println("\nEnter Course Details:");
     System.out.print("Course Title: ");
     String courseTitle = sc.nextLine();
     System.out.print("Number of modules: ");
     int modCount = sc.nextInt(); sc.nextLine();
     String[] modules = new String[modCount];
     for (int i = 0; i < modCount; i++) {
         System.out.print("Module " + (i + 1) + ": ");
         modules[i] = sc.nextLine();
     }
     Course course = new Course(courseTitle, instructor, modules);

     // Create student
     System.out.println("\nEnter Student Details:");
     System.out.print("Name: ");
     String studName = sc.nextLine();
     System.out.print("Email: ");
     String studEmail = sc.nextLine();
     Student student = new Student(studName, studEmail);

     // Enroll student
     student.enroll(course);

     // Menu for progress & grade
     while (true) {
         System.out.println("\nMenu:");
         System.out.println("1. Update Progress");
         System.out.println("2. Set Grade");
         System.out.println("3. Generate Certificate");
         System.out.println("4. Show Reviews");
         System.out.println("5. Show Course Rating");
         System.out.println("6. Exit");
         System.out.print("Choose: ");
         int choice = sc.nextInt();
         sc.nextLine();

         switch (choice) {
             case 1:
                 System.out.print("Enter progress to add (%): ");
                 double p = sc.nextDouble(); sc.nextLine();
                 student.updateProgress(p);
                 break;
             case 2:
                 System.out.print("Enter grade (A-F): ");
                 char g = sc.nextLine().toUpperCase().charAt(0);
                 student.setGrade(g);
                 break;
             case 3:
                 System.out.println(student.generateCertificate());
                 System.out.println("Format: " + course.certificateFormat());
                 break;
             case 4:
                 course.displayReviews();
                 break;
             case 5:
                 System.out.println("Current rating: " + course.getRating());
                 System.out.print("Update rating (0-5): ");
                 double r = sc.nextDouble(); sc.nextLine();
                 course.setRating(r);
                 System.out.println("Updated rating: " + course.getRating());
                 break;
             case 6:
                 System.out.println("Goodbye!");
                 sc.close();
                 return;
             default:
                 System.out.println("Invalid choice.");
         }
     }
 }
}
