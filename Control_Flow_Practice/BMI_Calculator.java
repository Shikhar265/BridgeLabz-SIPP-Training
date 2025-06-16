import java.util.*;
class BMI_Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight of the person: ");
        double weight = sc.nextDouble();
	System.out.print("Enter height(in cm) of the person: ");
        Double height = sc.nextDouble();
	height=height/100;
	Double BMI=weight/(height*height);
	if(BMI<=18.4)
	{
	    System.out.println("Underweight");
	}
	else if(BMI>=18.5 && BMI<=24.9)
	{
	    System.out.println("Normal");
	}
	if(BMI>=25.0 && BMI<=39.9)
	{
	    System.out.println("Overweight");
	}
	if(BMI>=40.0)
	{
	    System.out.println("Obese");
	}
     }
}
