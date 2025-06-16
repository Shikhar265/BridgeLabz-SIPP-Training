import java.util.*;
class Grades 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        int P_Marks = scanner.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int C_Marks = scanner.nextInt();
        System.out.print("Enter marks for Maths: ");
        int M_Marks = scanner.nextInt();
        double T_Marks = P_Marks + C_Marks + M_Marks;
        double percent = (T_Marks / 300.0) * 100;
        System.out.printf("Average Mark (Percentage): %.2f%%\n", percent);
        char grade;
        String remarks;
        if (percent >= 80) 
	{
            grade = 'A';
            remarks = "(Level 4, above agency-normalized standards)";
        }
	else if (percent >= 70) 
	{
            grade = 'B';
            remarks = "(Level 3, at agency-normalized standards)";
        }
	else if (percent >= 60) 
	{
            grade = 'C';
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        }
	else if (percent >= 50) 
	{
            grade = 'D';
            remarks = "(Level 1, well below agency-normalized standards)";
        }
	else if (percent >= 40) 
	{
            grade = 'E';
            remarks = "(Level 1-, too below agency-normalized standards)";
        }
	else 
	{
            grade = 'R';
            remarks = "(Remedial standards)";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}