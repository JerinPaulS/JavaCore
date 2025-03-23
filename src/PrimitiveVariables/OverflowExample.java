package PrimitiveVariables;

public class OverflowExample {

    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println("Max value: " + max);
        System.out.println("Max + 1: " + (max + 1)); // Overflow, wraps to negative
    }

}
