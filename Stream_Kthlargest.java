//Find the Kth largest number in list using streams concept
import java.util.*;
import java.util.stream.*;

public class Stream_Kthlargest{
    public static void main(String[] args){
        List<Integer> numbers=Arrays.asList(10,2,43,30,99);

        int k=3;
        Optional<Integer> Kth_largest=numbers.stream()
                            .sorted(Comparator.reverseOrder())
                            .skip(k - 1)
                            .findFirst();
        Kth_largest.ifPresent(System.out::println); // n->System.out.println(n)
        

    }

}