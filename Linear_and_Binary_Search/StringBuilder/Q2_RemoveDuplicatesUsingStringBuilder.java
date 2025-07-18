import java.util.*;

public class Q2_RemoveDuplicatesUsingStringBuilder {
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to remove duplicates: ");
        String input = sc.nextLine();

        String result = removeDuplicates(input);
        System.out.println("String without duplicates: " + result);
    }
}
