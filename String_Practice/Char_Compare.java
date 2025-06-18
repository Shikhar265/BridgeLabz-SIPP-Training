import java.util.*;
class Char_Compare
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next(); 

        char[] manual = get_Manually(input);
        char[] builtIn = input.toCharArray();

        System.out.print("Manual character array: ");
        print(manual);

        System.out.print("Built-in toCharArray result: ");
        print(builtIn);

        boolean isSame = compare(manual, builtIn);
        System.out.println("Are both arrays equal? " + isSame);
    }

    public static char[] get_Manually(String str)
    {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) 
        {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compare(char[] a, char[] b)
    {
        if (a.length != b.length) 
        {
            return false;
        }
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] != b[i]) 
            {
                return false;
            }
        }
        return true;
    }

    public static void print(char[] arr)
    {
        for (int i=0;i<arr.length;i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
