package FunctionalInterfaces;

import java.util.List;
import java.util.Arrays;

public class CustomFunctionalInterfaceExample {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Printer print = num -> System.out.println("Processing the number " + num);
        for (int num : nums)
                print.print(Integer.toString(num));
    }

}
