import java.util.*;
class Score_card 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) 
	    {
            System.out.println("Enter scores for student " + (i + 1) + ":");
            System.out.print("Physics: ");
            scores[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            scores[i][1] = sc.nextInt();
            System.out.print("Math: ");
            scores[i][2] = sc.nextInt();
        }
        double[][] results = calculateStats(scores);
        String[] grades = assignGrades(results);
        display(scores, results, grades);
    }

    public static double[][] calculateStats(int[][] scores) 
    {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) 
	    {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[] assignGrades(double[][] stats) 
    {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) 
	    {
            double p = stats[i][2];
            if (p >= 90) 
	        {
		        grades[i] = "A+";
	        }
            else if (p >= 80) 
	        {
		        grades[i] = "A";
	        } 
            else if (p >= 70) 
	        {
		        grades[i] = "B";
	        } 
            else if (p >= 60) 
	        {
		        grades[i] = "C";
	        } 
            else if (p >= 50) 
	        {
		        grades[i] = "D";
	        } 
            else 
	        {
		        grades[i] = "F";
	        }
        }
        return grades;
    }

    public static void display(int[][] scores, double[][] stats, String[] grades) 
    {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPerc\tGrade");
        for (int i = 0; i < scores.length; i++) 
	    {
            System.out.println((i+1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" + 
                               (int)stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "\t" + grades[i]);
        }
    }
}
