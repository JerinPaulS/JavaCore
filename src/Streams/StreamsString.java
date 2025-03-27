package Streams;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsString {

    public static void main(String[] args) {
        List<String> words = ArrayBuilder.createWords(10);

        // All the words in the list
        System.out.println("All the words in the list.");
        words.stream()
                .forEach(System.out::println);

        // Convert all the strings to UPPER CASE
        System.out.println("All words in upper case");
        words.stream()
                .map(word -> word.toUpperCase())
                .forEach(System.out::println);

        // Sorting the list in ascending order
        System.out.println("Sorted list in ascending order");
        words.stream()
                .sorted()
                .forEach(System.out::println);

        // Sorting the list in descending order
        System.out.println("Sorted list in descending order");
        words.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // The first non-repeated character in a string using Streams
        String word = words.get(0);
        String res = word.chars()
                .mapToObj(ch -> Character.toUpperCase(ch))
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .map(entry -> Character.toString(entry))
                .findFirst().get();
        System.out.println("The first non-repeated character in : " + word + " is " + res);
    }

}
