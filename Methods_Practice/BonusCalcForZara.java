import java.util.*;

public class BonusCalculator {

    public static int[][] generateSalariesAndService(int size) {
        Random rand = new Random();
        int[][] data = new int[size][2];

        for (int i = 0; i < size; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // salary
            data[i][1] = rand.nextInt(11); // years of service (0-10)
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double bonus = data[i][1] > 5 ? data[i][0] * 0.05 : data[i][0] * 0.02;
            result[i][0] = bonus;
            result[i][1] = data[i][0] + bonus;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] empData = generateSalariesAndService(10);
        double[][] bonusData = calculateBonusAndNewSalary(empData);

        double totalBonus = 0, totalOld = 0, totalNew = 0;

        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Emp#", "Salary", "Years", "Bonus", "New Salary");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.2f %-10.2f\n",
                (i + 1), empData[i][0], empData[i][1], bonusData[i][0], bonusData[i][1]);
            totalBonus += bonusData[i][0];
            totalOld += empData[i][0];
            totalNew += bonusData[i][1];
        }

        System.out.printf("Total Old Salary: %.2f\nTotal New Salary: %.2f\nTotal Bonus Paid: %.2f\n",
            totalOld, totalNew, totalBonus);
    }
}
