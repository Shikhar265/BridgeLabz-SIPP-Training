class Profit_Loss
{
    public static void main(String args[])
    {
	int CP=129,SP=191;
	double Profit=SP-CP;
	double Percentage=(Profit/CP)*100;
	System.out.println("The Cost Price is INR "+CP+" and the Selling Price is INR "+SP);
	System.out.print("The Profit is INR "+Profit+" and the profit percentage is ");
	System.out.printf("%.2f%%", Percentage);
    }
}