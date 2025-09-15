import java.lang.reflect.*;
import java.util.*;

class Employee {
    String name;
    int age;
}

public class Reflection_ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> props) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Map.Entry<String, Object> entry : props.entrySet()) {
            Field f = clazz.getDeclaredField(entry.getKey());
            f.setAccessible(true);
            f.set(obj, entry.getValue());
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Map<String, Object> props = new HashMap<>();

        System.out.print("Enter name: ");
        props.put("name", sc.nextLine());

        System.out.print("Enter age: ");
        props.put("age", sc.nextInt());

        Employee e = toObject(Employee.class, props);
        System.out.println("Employee: " + e.name + ", Age: " + e.age);
        sc.close();
    }
}
