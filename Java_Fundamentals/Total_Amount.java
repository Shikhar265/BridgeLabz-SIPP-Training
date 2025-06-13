import java.util.Scanner;
class Total_Amount
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter unit price: ");
	double unit_Price=sc.nextDouble();
	System.out.print("Enter quantity: ");
	int quantity=sc.nextInt();
	double total=unit_Price*quantity;
	System.out.println("The total purchase price is INR "+total+" if the quantity "+quantity+" and the unit price is INR "+unit_Price);
    }
}
