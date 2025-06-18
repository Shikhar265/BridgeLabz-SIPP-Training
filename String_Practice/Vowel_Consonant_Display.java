import java.util.*;
class Vowel_Consonant_Display 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a String: ");
        String text = sc.nextLine();
        String[][] result = analyzeCharacters(text);
        display(result);
    }

    public static String checkCharType(char ch) 
    {
        if (ch >= 'A' && ch <= 'Z') 
        {
            ch = (char)(ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') 
        {
            if ("aeiou".indexOf(ch) >= 0) 
            {
                return "Vowel";
            }
            else 
            {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] analyzeCharacters(String text) 
    {
        ArrayList<String[]> list = new ArrayList<>();
        for (int i = 0;; i++) 
        {
            try 
            {
                char ch = text.charAt(i);
                list.add(new String[]{String.valueOf(ch), checkCharType(ch)});
            } 
            catch (Exception e) 
            {
                break;
            }
        }
        return list.toArray(new String[0][0]);
    }

    public static void display(String[][] data) 
    {
        System.out.println("Char\tType");
        for (String[] row : data) 
        {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
