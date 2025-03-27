package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * A Consumer is an in-build functional interface in the java.util.function package. we use consumers when we need to
 * consume objects, the consumer takes an input value and returns nothing. The consumer interface has two methods.
 *
 * void accept(T value);
 * default Consumer<T> andThen(Consumer<? super T> after);
 * Here, we printing the cities by creating a consumer. passing city in consumer as argument and printing.
 */

public class ConsumerExample {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Pune");

        Consumer<String> consumer = city -> System.out.println(city);
        for (int index = 0; index < cities.size(); index++)
            consumer.accept(cities.get(index));
    }

}
