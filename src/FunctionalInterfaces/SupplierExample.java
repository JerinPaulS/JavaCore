package FunctionalInterfaces;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * The Supplier Interface is a part of the java.util.function package. It represents a function that does not take in
 * any argument but produces a value of type T. It contains only one method.
 *
 * T get();
 * We created a city’s supplier for producing cities list and printing it.
 */

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String[]> cities = () -> {
            return new String[] {"Delhi", "Mumbai", "Bengaluru", "Pune"};
        };

        Arrays.asList(cities.get()).forEach(System.out::println);
    }

}
