import java.util.*;
public class Number_Checker_6 
{
    public static int countDigits(int n) 
    {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) 
    {
        int[] d = new int[countDigits(n)];
        for (int i = d.length - 1; i >= 0; i--) 
	{
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    public static int sumDigits(int[] d) 
    {
        int sum = 0;
        for (int x : d) 
	{
	    sum += x;
	}
        return sum;
    }

    public static int squareSumDigits(int[] d) 
    {
        int sum = 0;
        for (int x : d) 
	{
	    sum += x * x;
	}
        return sum;
    }

    public static boolean isHarshad(int n, int[] d) 
    {
        return n % sumDigits(d) == 0;
    }

    public static int[][] digitFrequency(int[] d) 
    {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) 
	{
	    freq[i][0] = i;
	}
        for (int x : d) 
	{
	    freq[x][1]++;
	}
        return freq;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = getDigits(n);
        System.out.println("Sum of Digits: " + sumDigits(d));
        System.out.println("Square Sum of Digits: " + squareSumDigits(d));
        System.out.println("Is Harshad: " + isHarshad(n, d));
        int[][] freq = digitFrequency(d);
        System.out.println("Digit Frequencies:");
        for (int[] f : freq) 
	{
            if (f[1] > 0) 
	    {
		System.out.println(f[0] + ": " + f[1]);
	    }
        }
    }
}
