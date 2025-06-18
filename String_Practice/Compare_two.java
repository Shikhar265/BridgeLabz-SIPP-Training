import java.util.*;
class Compare_Two
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean is_Char = compareUsingCharAt(str1, str2);
        boolean is_Equal = str1.equals(str2);

        System.out.println("Result using charAt comparison: " + is_Char);
        System.out.println("Result using equals() method: " + is_Equal);
    }

    public static boolean compareUsingCharAt(String str1, String str2) 
    {
        if (str1.length() != str2.length()) 
	    {
	        return false;
	    }
        for (int i = 0; i < str1.length(); i++) 
	    {
            if (str1.charAt(i) != str2.charAt(i)) 
	        {
		        return false;
	        }
        }
        return true;
    }
}
