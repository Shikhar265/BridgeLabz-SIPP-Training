import java.util.*;

public class StudentGradesAnalyzer {
    static class Student {
        String name;
        String id;

        Student(String name, String id) {
            this.name = name;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students, subjects;

        System.out.print("Enter number of students: ");
        students = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        subjects = sc.nextInt();

        Student[] studentList = new Student[students];
        int[][] grades = new int[students][subjects];

        for (int i = 0; i < students; i++) {
            sc.nextLine(); // consume newline
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("ID: ");
            String id = sc.nextLine();
            studentList[i] = new Student(name, id);

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter grade for subject " + (j + 1) + ": ");
                try {
                    int grade = sc.nextInt();
                    if (grade < 0 || grade > 100) {
                        throw new IllegalArgumentException("Grade must be between 0 and 100.");
                    }
                    grades[i][j] = grade;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Setting grade to 0.");
                    sc.next(); // clear invalid input
                    grades[i][j] = 0;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + " Setting grade to 0.");
                    grades[i][j] = 0;
                }
            }
        }

        System.out.println("\nStudent Report:");
        double totalClass = 0;
        int totalCount = 0;

        for (int i = 0; i < students; i++) {
            int total = 0;
            int count = 0;
            System.out.println("\nStudent: " + studentList[i].name + " (ID: " + studentList[i].id + ")");
            for (int j = 0; j < subjects; j++) {
                int grade = grades[i][j];
                if (grade >= 0) {
                    total += grade;
                    count++;
                }
                System.out.println("Subject " + (j + 1) + ": " + grade);
            }
            if (count > 0) {
                double avg = (double) total / count;
                System.out.println("Total: " + total + ", Average: " + avg);
                totalClass += total;
                totalCount += count;
            } else {
                System.out.println("No valid grades available.");
            }
        }

        System.out.println("\nHighest Grades per Subject:");
        for (int j = 0; j < subjects; j++) {
            int max = -1;
            for (int i = 0; i < students; i++) {
                if (grades[i][j] > max) {
                    max = grades[i][j];
                }
            }
            System.out.println("Subject " + (j + 1) + ": " + max);
        }

        double classAverage = totalCount > 0 ? totalClass / totalCount : 0;
        System.out.println("\nOverall Class Average: " + classAverage);
    }
}
