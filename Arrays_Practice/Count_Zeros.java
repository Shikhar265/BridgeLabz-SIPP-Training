import java.util.*;
class Count_Zeros 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int zeroCount = 0;
        for (int i = 0; i < n; i++) 
	{
            arr[i] = sc.nextInt();
            if (arr[i] == 0) zeroCount++;
        }
        System.out.println("Number of zeros: " + zeroCount);
    }
}
