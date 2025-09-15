import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Word_Frequency_Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input paragraph
        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        // Split paragraph into words (remove punctuation, case-insensitive)
        String[] words = paragraph.toLowerCase()
                                  .replaceAll("[^a-z0-9\\s]", "") // keep only words & digits
                                  .split("\\s+");

        // Convert to stream and count frequency using toMap()
        Map<String, Integer> wordCount = Arrays.stream(words)
            .filter(w -> !w.isEmpty()) // ignore empty
            .collect(Collectors.toMap(
                w -> w,      // key = word
                w -> 1,      // initial value = 1
                Integer::sum // merge function for duplicates
            ));

        // Print results
        System.out.println("\nWord Frequencies:");
        wordCount.forEach((word, count) -> 
            System.out.println(word + " -> " + count)
        );

        sc.close();
    }
}
