import java.lang.reflect.*;

class Book {
    String title;
    int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
}

public class Reflection_JSON {
    public static String toJson(Object obj) throws Exception {
        StringBuilder sb = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            sb.append("\"" + fields[i].getName() + "\":\"" + fields[i].get(obj) + "\"");
            if (i < fields.length - 1) sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter number of pages: ");
        int pages = sc.nextInt();

        Book b = new Book(title, pages);
        System.out.println("JSON: " + toJson(b));
        sc.close();
    }
}
