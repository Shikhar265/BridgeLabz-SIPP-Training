import java.util.Scanner;
class HandShakes 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num_Students = sc.nextInt();
        int handshakes = (num_Students * (num_Students-1)) / 2;
        System.out.println("The maximum number of handshakes is " + handshakes);
    }
}
