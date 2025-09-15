import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author { String name(); }

@Author(name = "Shikhar Gupta")
class DemoClass {}

public class Reflection_Annotation {
    public static void main(String[] args) {
        Class<DemoClass> clazz = DemoClass.class;
        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        }
    }
}
