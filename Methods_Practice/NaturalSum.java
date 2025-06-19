import java.util.*;

public class Main {

    // Corrected method signature to return a single double value
    public int NaturalSum(int n) {
	int sum=0;
	for(int i=0;i<=n;i++){
		sum+=i;	
}        
	return sum;

    }

    public static void main(String[] args) {
        Main calculator = new Main();
        Scanner sc = new Scanner(System.in);

        // Input No.
        System.out.print("Enter No.: ");
        int n = sc.nextInt();

        int result = calculator.NaturalSum(n);

        // Display the result
        System.out.println("Sum: " + result);
    }
}
