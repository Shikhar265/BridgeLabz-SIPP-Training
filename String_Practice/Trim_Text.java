import java.util.*;
class Trim_Text 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        int[] range = trimIndex(input);
        String trimmed = substring(input, range[0], range[1]);
        String builtin = input.trim();
        boolean same = compareStrings(trimmed, builtin);
        System.out.println("Custom Trim Result: \"" + trimmed + "\"");
        System.out.println("Matches with Built-in: " + same);
    }

    public static int[] trimIndex(String text) 
    {
        int start = 0, end = 0;
        for (int i = 0;; i++) 
	    {
            try 
	        {
                if (text.charAt(i) != ' ') 
		        {
                    start = i;
                    break;
                }
            } 
	        catch (Exception e) 
	        {
                break;
            }
        }
        for (int i = start;; i++) 
	    {
            try 
	        {
                if (text.charAt(i) != ' ') end = i;
            } 
	        catch (Exception e) 
	        {
                break;
            }
        }
        return new int[]{start, end};
    }

    public static String substring(String text, int start, int end) 
    {
        String result = "";
        for (int i = start; i <= end; i++) 
	    {
	        result += text.charAt(i);
	    }
        return result;
    }

    public static boolean compareStrings(String a, String b) 
    {
        if (a.length() != b.length()) 
	    {
	        return false;
	    }
        for (int i = 0; i < a.length(); i++) 
	    {
            if (a.charAt(i) != b.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
}
