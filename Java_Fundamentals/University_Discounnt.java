import java.util.*;
class fee_Discount
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.print("University fee = ");
	double fee=sc.nextDouble();
	System.out.print("University Discount = ");
	double dis_per=sc.nextDouble();;
	double discount=(fee*(dis_per/100));
	double final_fee=fee-discount;
	System.out.print("The discount amount is INR "+discount+" and final discounted fee is INR "+final_fee);
    }
}