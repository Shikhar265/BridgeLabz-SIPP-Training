import java.util.*;

public class StudentVoteChecker {

    // Method to check if student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean canVote = checker.canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Invalid age. Cannot vote.");
            } else if (canVote) {
                System.out.println("Eligible to vote.");
            } else {
                System.out.println("Not eligible to vote.");
            }
        }
    }
}
