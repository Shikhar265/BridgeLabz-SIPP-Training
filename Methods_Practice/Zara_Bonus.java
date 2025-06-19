import java.util.*;
public class Zara_Bonus 
{
    public static double[][] generateSalaryAndService() 
    {
        double[][] data = new double[10][2];
        Random r = new Random();
        for (int i = 0; i < 10; i++) 
	{
            data[i][0] = 10000 + r.nextInt(90000);
            data[i][1] = 1 + r.nextInt(10);
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] salaryService) 
    {
        double[][] newSalaryBonus = new double[10][2];
        for (int i = 0; i < 10; i++) 
	{
            double salary = salaryService[i][0];
            double years = salaryService[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            newSalaryBonus[i][0] = salary + bonus;
            newSalaryBonus[i][1] = bonus;
        }
        return newSalaryBonus;
    }

    public static void main(String[] args) 
    {
        double[][] data = generateSalaryAndService();
        double[][] result = calculateBonus(data);
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Emp\tOldSalary\tYears\tNewSalary\tBonus");
        for (int i = 0; i < 10; i++) 
	{
            double oldSalary = data[i][0];
            double years = data[i][1];
            double newSalary = result[i][0];
            double bonus = result[i][1];
            totalOld += oldSalary;
            totalNew += newSalary;
            totalBonus += bonus;
            System.out.println((i + 1) + "\t" + oldSalary + "\t" + years + "\t" + newSalary + "\t" + bonus);
        }
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
        System.out.println("Total Bonus: " + totalBonus);
    }
}
