import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.Scanner;

// Step 1: Define annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

// Step 2: User class with annotated fields
class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }
}

// Step 3: Serialization method
class JsonSerializer {
    public static String toJson(Object obj) throws Exception {
        StringBuilder sb = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();
        boolean first = true;

        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonField.class)) {
                if (!first) sb.append(", ");
                JsonField jf = field.getAnnotation(JsonField.class);
                sb.append("\"").append(jf.name()).append("\": ");
                Object value = field.get(obj);
                if (value instanceof String) sb.append("\"").append(value).append("\"");
                else sb.append(value);
                first = false;
            }
        }

        sb.append("}");
        return sb.toString();
    }
}

// Step 4: Main program with user input
public class JsonField_Example {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        User user = new User(username, age);
        String json = JsonSerializer.toJson(user);

        System.out.println("Generated JSON: " + json);

        sc.close();
    }
}
