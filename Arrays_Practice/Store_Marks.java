import java.util.*;
class Store_Marks 
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
        System.out.println("Marks stored in 2D array:");
        for (int i = 0; i < 5; i++) 
	{
            System.out.print("Student " + (i + 1) + " marks: ");
            for (int j = 0; j < 3; j++) 
	    {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
