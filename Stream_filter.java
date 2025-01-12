//Stream_filter ques1
import java.util.*;
import java.util.stream.*;

public class Stream_filter{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        double average = Arrays.stream(numbers)  
                               .average()       
                               .getAsDouble();  
        // Print the average
        System.out.println("Average: " + average);
    }
}
    
