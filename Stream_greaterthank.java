import java .util.*;
import java.util.stream.*;

public class Stream_greaterthank{
    public static void main(String[] args){
        List<Integer> numbers=Arrays.asList(10,2,43,30,99);
        int k=30;
        // 
        numbers.stream()
            .filter(n -> n > k)
            .forEach(System.out::println);


    }
}