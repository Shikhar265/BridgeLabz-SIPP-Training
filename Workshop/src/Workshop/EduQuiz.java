package Workshop;

import java.util.*;

public class EduQuiz {
    
    // Method to calculate score and display feedback
    public static int calculateScore(String[] correct, String[] student) {
        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(student[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
                score++;
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define correct answers
        String[] correctAnswers = {"A", "B", "C", "D", "A", "B", "C", "D", "A", "B"};
        String[] studentAnswers = new String[10];

        // Input student's answers
        System.out.println("Enter your answers (A/B/C/D) for 10 questions:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Answer for Question " + (i + 1) + ": ");
            studentAnswers[i] = sc.nextLine().trim();
        }

        // Calculate and print score
        System.out.println("\nFeedback:");
        int totalScore = calculateScore(correctAnswers, studentAnswers);
        System.out.println("\nTotal Score: " + totalScore + " out of 10");
        sc.close();
    }
}
