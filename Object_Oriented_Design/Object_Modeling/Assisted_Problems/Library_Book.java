import java.util.*;

// Class representing a Book
class Book 
{
    String title;      
    String author;     

    // Constructor to initialize book details
    Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    void displayBook() 
    {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Class representing a Library that aggregates Books
class Library 
{
    String libraryName;             
    ArrayList<Book> books;          

    // Constructor to initialize library name
    Library(String libraryName) 
    {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    void addBook(Book book) 
    {
        books.add(book);
    }

    // Method to display all books in the library
    void displayLibraryBooks() 
    {
        System.out.println("\nLibrary: " + libraryName);
        for (Book book : books) 
        {
            book.displayBook();
        }
    }
}

// Main class to test aggregation with user input
public class Library_Book 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Taking input for first library
        System.out.print("Enter name of first library: ");
        String lib1 = sc.nextLine();
        Library library1 = new Library(lib1);

        System.out.print("Enter number of books in " + lib1 + ": ");
        int n1 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n1; i++) 
        {
            System.out.print("Enter title of book " + (i + 1) + ": ");
            String title = sc.nextLine();

            System.out.print("Enter author of book " + (i + 1) + ": ");
            String author = sc.nextLine();

            library1.addBook(new Book(title, author));
        }

        // Taking input for second library
        System.out.print("\nEnter name of second library: ");
        String lib2 = sc.nextLine();
        Library library2 = new Library(lib2);

        System.out.print("Enter number of books in " + lib2 + ": ");
        int n2 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n2; i++) 
        {
            System.out.print("Enter title of book " + (i + 1) + ": ");
            String title = sc.nextLine();

            System.out.print("Enter author of book " + (i + 1) + ": ");
            String author = sc.nextLine();

            library2.addBook(new Book(title, author));
        }

        // Displaying books in both libraries
        library1.displayLibraryBooks();
        library2.displayLibraryBooks();
    }
}
