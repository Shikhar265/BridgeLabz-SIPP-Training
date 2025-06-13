import java.util.*;
class Discount
{
    public static void main(String args[])
    {
	double dis_per=10.0,fee=125000.0;
	double discount=(fee*(dis_per/100));
	double final_fee=fee-discount;
	System.out.print("The discount amount is INR "+discount+" and final discounted fee is INR "+final_fee);
    }
}