import java.util.*;

public class SuppressWarnings_Example {
    @SuppressWarnings("unchecked") // hides unchecked warnings
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Raw ArrayList (without generics)
        ArrayList rawList = new ArrayList();

        System.out.print("Enter number of elements to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = sc.nextLine();
            rawList.add(element); // unchecked but allowed
        }

        System.out.println("\n📋 Elements in Raw List: " + rawList);

        sc.close();
    }
}
