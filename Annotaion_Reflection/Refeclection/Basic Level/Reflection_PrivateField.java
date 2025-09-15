import java.lang.reflect.*;
import java.util.Scanner;

class Person {
    private int age = 20;
}

public class Reflection_PrivateField {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();

        System.out.print("Enter new age for Person: ");
        int newAge = sc.nextInt();

        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);
        field.set(p, newAge);

        System.out.println("Updated Age: " + field.get(p));
        sc.close();
    }
}
