import java.util.*;
class BMI_Multi 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) 
	{
            System.out.print("Enter weight in kg for person " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            System.out.print("Enter height in meters for person " + (i + 1) + ": ");
            double height = sc.nextDouble();
            if (weight <= 0 || height <= 0) 
	    {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = weight / (height * height);
            double bmi = personData[i][2];
            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 24.9) weightStatus[i] = "Normal";
            else if (bmi < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        for (int i = 0; i < number; i++) 
	{
            System.out.println("Person " + (i + 1) + ": Height = " + personData[i][0] + " m, Weight = " + personData[i][1] + " kg, BMI = " + personData[i][2] + ", Status = " + weightStatus[i]);
        }
    }
}