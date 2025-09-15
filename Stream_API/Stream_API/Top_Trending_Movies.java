

import java.util.*;
import java.util.stream.*;

class Movie {
    String title;
    int releaseYear;
    double rating;

    Movie(String title, int releaseYear, double rating) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return title + " | Year: " + releaseYear + " | Rating: " + rating;
    }
}

public class Top_Trending_Movies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Avengers: Endgame", 2019, 8.4),
            new Movie("Dune", 2021, 8.2),
            new Movie("Spider-Man: No Way Home", 2021, 8.7),
            new Movie("The Batman", 2022, 8.3),
            new Movie("Oppenheimer", 2023, 9.0),
            new Movie("Barbie", 2023, 7.2),
            new Movie("Top Gun: Maverick", 2022, 8.6),
            new Movie("Joker", 2019, 8.5),
            new Movie("Mission Impossible 7", 2023, 8.1),
            new Movie("Interstellar Re-Release", 2023, 9.1)
        );

        System.out.println("=== Top 5 Trending Movies (2020 onwards) ===");

        movies.stream()
            .filter(m -> m.releaseYear >= 2020)  // ✅ released after 2020
            .sorted(Comparator.comparingDouble((Movie m) -> m.rating)
                              .reversed()
                              .thenComparing((Movie m) -> m.releaseYear, Comparator.reverseOrder()))
            .limit(5) // ✅ Top 5
            .forEach(System.out::println);
    }
}
