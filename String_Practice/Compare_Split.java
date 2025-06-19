import java.util.*;
class Compare_Split 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        String[] builtin = input.split(" ");
        String[] custom = customSplit(input);
        boolean same = compareArrays(builtin, custom);
        System.out.println("Arrays same: " + same);
    }

    public static String[] customSplit(String text) 
    {
        ArrayList<String> words = new ArrayList<>();
        String temp = "";
        for (int i = 0;; i++) 
	    {
            try 
	        {
                char ch = text.charAt(i);
                if (ch == ' ') 
		        {
                    if (!temp.equals("")) 
                    {
                        words.add(temp);
                    }
                    temp = "";
                } 
                else 
                {
                    temp += ch;
                }
            } 
	        catch (Exception e) 
	        {
                if (!temp.equals("")) 
                {
                    words.add(temp);
                }
                break;
            }
        }
        return words.toArray(new String[0]);
    }

    public static boolean compareArrays(String[] a, String[] b) 
    {
        if (a.length != b.length)
        {
            return false;
        }
        for (int i = 0; i < a.length; i++) 
	    {
            if (!a[i].equals(b[i]))
            {
                return false;
            } 
        }
        return true;
    }
}
