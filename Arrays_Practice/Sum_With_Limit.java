import java.util.*;
class Sum_Limited 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;	
	System.out.println("Enter the value from 0 to 10: ");
        while (true) 
	{
            double input = sc.nextDouble();
            if (input <= 0 || index == 10) 
	    {
                break;
            }
            arr[index] = input;
            index++;
        }
        for (int i = 0; i < index; i++) 
	{
            total += arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("Total sum: " + total);
    }
}
