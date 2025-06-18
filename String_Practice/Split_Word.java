import java.util.*;
class Split_Word
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordLengths = wordWithLengths(words);
        int[] result = findMinMax(wordLengths);

        System.out.println("Shortest word: " + wordLengths[result[0]][0]);
        System.out.println("Longest word: " + wordLengths[result[1]][0]);
    }

    public static String[] splitWords(String text)
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
                    if (!temp.equals("")) words.add(temp);
                    temp = "";
                }
                else
                {
                    temp += ch;
                }
            }
            catch (Exception e)
            {
                if (!temp.equals("")) words.add(temp);
                break;
            }
        }
        return words.toArray(new String[0]);
    }

    public static int getLength(String str)
    {
        int count = 0;
        try
        {
            while (true)
            {
                str.charAt(count);
                count++;
            }
        }
        catch (Exception e)
        {
            return count;
        }
    }

    public static String[][] wordWithLengths(String[] words)
    {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++)
        {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static int[] findMinMax(String[][] data)
    {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < data.length; i++)
        {
            int len = Integer.parseInt(data[i][1]);
            int minLen = Integer.parseInt(data[minIndex][1]);
            int maxLen = Integer.parseInt(data[maxIndex][1]);

            if (len < minLen) minIndex = i;
            if (len > maxLen) maxIndex = i;
        }
        return new int[] {minIndex, maxIndex};
    }
}
