import java.util.*;
class Vowel_Consonant 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        int[] result = countVowelsConsonants(input);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }

    public static int[] countVowelsConsonants(String str) 
    {
        int vowels = 0, consonants = 0;
        for (int i = 0;; i++) 
        {
            try 
            {
                char ch = str.charAt(i);
                if (ch >= 'A' && ch <= 'Z') 
                {
                    ch += 32;
                }
                if (ch >= 'a' && ch <= 'z') 
                {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                    {
                        vowels++;
                    }
                    else 
                    {
                        consonants++;
                    }
                }
            } 
            catch (Exception e) 
            {
                break;
            }
        }
        return new int[]{vowels, consonants};
    }
}
