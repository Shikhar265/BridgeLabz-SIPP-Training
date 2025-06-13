import java.util.Scanner;
class Distance_Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter distance in feets ");
        int dis_Feet = sc.nextInt();
        double yards = dis_Feet / 3.0;
        double miles = yards / 1760.0;
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.2f", yards, miles);
    }
}
