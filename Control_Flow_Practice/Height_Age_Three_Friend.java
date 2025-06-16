import java.util.*;
class Height_Age
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int age1 = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        double height1 = sc.nextDouble();
        System.out.print("Enter Akbar's age: ");
        int age2 = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        double height2 = sc.nextDouble();
        System.out.print("Enter Anthony's age: ");
        int age3 = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        double height3 = sc.nextDouble();
        String youngest = (age1 < age2 && age1 < age3) ? "Amar" : (age2 < age3 ? "Akbar" : "Anthony");
        String tallest = (height1 > height2 && height1 > height3) ? "Amar" : (height2 > height3 ? "Akbar" : "Anthony");

        System.out.println("The youngest friend is " + youngest);
        System.out.println("The tallest friend is " + tallest);
    }
}
