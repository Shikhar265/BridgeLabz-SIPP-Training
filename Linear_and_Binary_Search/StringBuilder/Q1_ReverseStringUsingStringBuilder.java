import java.util.Scanner;

public class Q1_ReverseStringUsingStringBuilder {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        String reversed = reverse(input);
        System.out.println("Reversed String: " + reversed);
    }
}
