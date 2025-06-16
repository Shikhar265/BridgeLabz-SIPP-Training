import java.util.*;
class Greatest_Factor 
{
    public static void main(String[] args) 
    {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int num=sc.nextInt();
	int fact=1;	
	int count=num-1;
	while(count>=1)
	{
	    if(num%count==0)
	    {
	    	fact=count;
		break;
	    }
	    count--;
	}
	System.out.println("Greatest factor of "+num+" beside itself is "+fact);
    }
}
