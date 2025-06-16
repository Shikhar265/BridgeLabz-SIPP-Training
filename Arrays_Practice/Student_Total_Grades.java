import java.util.*;
class Student_Total_Grades 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[5][3];
        for (int i = 0; i < 5; i++) 
	{
            System.out.println("Enter 3 subject marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) 
	    {
                marks[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) 
	{
            int total = 0;
            for (int j = 0; j < 3; j++) 
	    {
                total += marks[i][j];
            }
            System.out.println("Student " + (i + 1) + " total marks: " + total);
        }
    }
}
