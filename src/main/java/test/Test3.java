package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Java 8 to example for filter.
public class Test3 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10,2,3,9,11,8,5,33);
        // squaring the List elements.
        List<Integer> square = integers.stream().map(x -> x*x).collect(Collectors.toList());
        // filtering elements less than 100.
        List<Integer> result = square.stream().filter(n -> n < 100).collect(Collectors.toList());
        System.out.println(result);
    }
}
