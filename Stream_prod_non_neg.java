import java.util.*;
import java.util.stream.*;

public class Stream_prod_non_neg{
    public static void main(String[] args){
        List<Integer> numbers= Arrays.asList(10,-2,-43,-30,-99);

        Integer product=numbers.stream()
        .filter(n -> n>=0)
        .reduce(1,(a,b) -> a*b);
        
        System.out.println("product is"+product);
    }
}