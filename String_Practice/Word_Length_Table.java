import java.util.*;
class Word_Length 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[][] data = wordLengths(words);
        display(data);
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

    public static int getLength(String word) 
    {
        int count = 0;
        for (;; count++) 
        {
            try 
            {
                word.charAt(count);
            } 
            catch (Exception e) 
            {
                break;
            }
        }
        return count;
    }

    public static String[][] wordLengths(String[] words) 
    {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) 
        {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void display(String[][] data) 
    {
        System.out.println("Word\tLength");
        for (String[] row : data) 
        {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
