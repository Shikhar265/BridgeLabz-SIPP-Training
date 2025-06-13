import java.util.Scanner;
class Simple_Interest 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time: ");
        double t = sc.nextDouble();
        double SI = p* r* t/ 100;
        System.out.println("The Simple Interest is " + SI + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
    }
}
