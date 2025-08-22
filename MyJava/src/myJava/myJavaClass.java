package myJava;

import java.util.*;
import java.util.stream.*;

public class myJavaClass {
    public static void main(String[] args) {
        // Integer[] arr = {1000, 2000, 3000};
        // Stream<Integer> s = Arrays.stream(arr);
        
        // Stream<Integer> s = Stream.of(1000, 2000, 3000);
        
        // Stream.Builder<Integer> s = Stream.builder();
        // s.add(100).add(200).add(3000);
        // Stream<Integer> ss = s.build();
        
        // Stream<Integer> s = Stream.iterate(1000, (Integer n) -> n + 5000).limit(5);

        // List<List<String>> list = Arrays.asList(Arrays.asList("hello", "world"), Arrays.asList("namaste", "india", "tim"));
        // Stream<String> s = list.stream().flatMap(((List<String> str) -> str.stream().map((String ss) -> ss.toUpperCase())));
        
        // List<Integer> list = Arrays.asList(1,3,3,4,5,1,2,9);
        // Stream<Integer> s = list.stream().filter((Integer val) -> val > 2).peek((Integer val) -> System.out.println(val)).map((Integer val ) -> val *-1);

        List<Integer> list = Arrays.asList(1,3,3,4,5,1,2,9);
        Stream<Integer> s= list.stream().limit(3);
        List<Integer> l =  s.collect(Collectors.toList());
        System.out.println(l);
    }   
}
