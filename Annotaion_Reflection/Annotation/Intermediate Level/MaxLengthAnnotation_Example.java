import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.Scanner;

// Step 1: Define annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

// Step 2: User class with annotated field
class User {
    @MaxLength(10) // username cannot exceed 10 chars
    private String username;

    public User(String username) throws Exception {
        Field field = User.class.getDeclaredField("username");

        if (field.isAnnotationPresent(MaxLength.class)) {
            MaxLength maxLength = field.getAnnotation(MaxLength.class);

            if (username.length() > maxLength.value()) {
                throw new IllegalArgumentException(
                    "❌ Username exceeds max length of " + maxLength.value()
                );
            }
        }

        this.username = username;
        System.out.println("✅ User created with username: " + this.username);
    }
}

// Step 3: Main program with user input
public class MaxLengthAnnotation_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String input = sc.nextLine();

        try {
            new User(input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
