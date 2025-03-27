package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * A Predicate is a functional interface, which accepts an argument and returns a boolean. Usually, it is used to apply
 * in a filter for a collection of objects.
 *
 * boolean test(T value);
 * default Predicate<T> and(Predicate<? super T> other);
 * default Predicate<T> negate();
 * default Predicate<T> or(Predicate<? super T> other);
 * static <T> Predicate<T> isEqual(Object targetRef);
 * static <T> Predicate<T> not(Predicate<? super T> target);
 * Here, we filter cities according to city name by a predicate and print it on the console.
 */

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));
        System.out.println("Is 5 even? " + isEven.test(5));

        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Pune");

        Predicate<String> isPune = city -> city.equals("Pune");
        cities.stream().filter(isPune).forEach(System.out::println);
    }

}
