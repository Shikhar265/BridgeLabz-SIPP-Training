import java.util.Scanner;

public class Q1_ConcatenateStringsUsingStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        StringBuffer sb = new StringBuffer();
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            sb.append(sc.nextLine());
        }

        System.out.println("Concatenated String: " + sb.toString());
    }
}
