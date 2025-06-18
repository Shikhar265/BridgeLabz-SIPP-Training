import java.util.*;
class Lowercase_Compare
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the complete text: ");
        String input = sc.nextLine();

        String manual = convert(input);
        String builtIn = input.toLowerCase();

        System.out.println("Manual lowercase: " + manual);
        System.out.println("Built-in toLowerCase(): " + builtIn);

        boolean isSame = compare(manual, builtIn);
        System.out.println("Are both strings equal? " + isSame);
    }

    public static String convert(String str)
    {
        String result = "";
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') 
            {
                ch = (char)(ch + 32);  
            }
            result += ch;
        }
        return result;
    }

    public static boolean compare(String str1, String str2)
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
