package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsNumbers {

    public static void main(String[] args) {
        List<Integer> nums = ArrayBuilder.createNumbers(10);

        System.out.println("All the numbers in the list");
        Stream<Integer> numStream = nums.stream();
        numStream.forEach(System.out::println);

        // Filter out even numbers from the list
        System.out.println("All the even numbers in the list");
        nums.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Sum of all numbers in the list
        System.out.println("Sum of all the numbers in the list = " +
                nums.stream()
                        .mapToInt(num -> num)
                        .sum());

        // Sum of all odd numbers in the list
        System.out.println("Sum of all the numbers in the list = " +
                nums.stream()
                        .filter(num -> num % 2 != 0)
                        .mapToInt(num -> num)
                        .sum());
    }

}
