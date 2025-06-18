import java.util.*;
class Voting_Eligibility 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter age of person " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        String[][] result = checkVoting(ages);
        displayResult(result);
    }

    public static String[][] checkVoting(int[] ages) 
    {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) 
        {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return result;
    }

    public static void displayResult(String[][] data) 
    {
        System.out.println("Age\tCan Vote");
        for (String[] row : data) 
        {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
