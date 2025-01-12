import java.util.*;
import java.util.stream.*;

public class Stream_nonrepeat {
    public static void main(String[] args) {
        String input = "swiss";

        // Create a frequency map of characters
        Map<Character, Long> frequencyMap = input.chars()  
            .mapToObj(c -> (char) c)  
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));  
        // Print non-repeating characters (those with count 1)
        frequencyMap.forEach((key, value) -> {
            if (value == 1) {  // If the character occurs only once, it's non-repeating
                System.out.println(key);  // Print the non-repeating character
            }
        });
    }
}
