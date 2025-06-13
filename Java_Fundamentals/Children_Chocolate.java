import java.util.Scanner;
class Children_Chocolate 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int num_Chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int num_Children = sc.nextInt();
        int gets = num_Chocolates / num_Children;
        int remaining = num_Chocolates % num_Children;
        System.out.println("The number of chocolates each child gets is " + gets + " and the number of remaining chocolates is " + remaining);
    }
}
