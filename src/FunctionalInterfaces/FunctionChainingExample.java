package FunctionalInterfaces;

import java.util.function.Function;

public class FunctionChainingExample {

    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy3 = num -> num * 3;
        Function<Integer, Integer> add10 = num -> num + 10;

        Function<Integer, Integer> combine = multiplyBy3.andThen(add10);

        System.out.println("Result = " + combine.apply(100));
    }

}
