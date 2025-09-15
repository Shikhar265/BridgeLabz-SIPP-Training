import java.util.*;
import java.util.stream.Collectors;

class Book {
    String title;
    String genre;
    int pages;

    Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    String getGenre() {
        return genre;
    }

    int getPages() {
        return pages;
    }
}

public class Library_Book_Statistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of books
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<Book> books = new ArrayList<>();

        // Take book input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter title of book " + (i + 1) + ": ");
            String title = sc.nextLine();

            System.out.print("Enter genre of " + title + ": ");
            String genre = sc.nextLine();

            System.out.print("Enter number of pages in " + title + ": ");
            int pages = sc.nextInt();
            sc.nextLine(); // consume newline

            books.add(new Book(title, genre, pages));
        }

        // Group by genre and summarize page statistics
        Map<String, IntSummaryStatistics> statsByGenre = books.stream()
            .collect(Collectors.groupingBy(
                Book::getGenre,
                Collectors.summarizingInt(Book::getPages)
            ));

        // Display results
        System.out.println("\nLibrary Book Statistics by Genre:");
        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("  Total Pages: " + stats.getSum());
            System.out.println("  Average Pages: " + stats.getAverage());
            System.out.println("  Max Pages: " + stats.getMax());
        });

        sc.close();
    }
}
