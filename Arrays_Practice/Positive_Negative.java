import java.util.*;
class Positive_Negative 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int pos = 0, neg = 0;
        for (int i = 0; i < n; i++) 
	{
            arr[i] = sc.nextInt();
            if (arr[i] >= 0) pos++;
            else neg++;
        }
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
    }
}
