package org.learning.example;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElementInList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        // Way 1 using Set
        Set<Integer> set = new HashSet<>();
        myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
        // Using Collection.frequency
        myList.stream().filter(n -> Collections.frequency(myList,n) > 1)
                .collect(Collectors.toSet()).forEach(System.out::println);
    }
}
