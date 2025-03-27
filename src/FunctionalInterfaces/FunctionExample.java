package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * A Function is another in-build functional interface in java.util.function package, the function takes an input value
 * and returns a value. The function interface has four methods, mostly function used in map feature of stream APIs.
 *
 * R apply(T var1);
 * default <V> Function<V, R> compose(Function<V, T> before);
 * default <V> Function<T, V> andThen(Function<R, V> after);
 * static <T> Function<T, T> identity();
 * We take an example, here we passing city’s as argument and returning the first character of cities.
 */

public class FunctionExample {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Pune");

        Function<String, Character> getFirstChar = city -> {
            return city.charAt(0);
        };

        cities.stream().map(getFirstChar).forEach(System.out::println);
    }

}
