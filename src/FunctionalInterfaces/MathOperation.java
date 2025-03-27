package FunctionalInterfaces;

@FunctionalInterface
public interface MathOperation {

    int add(int a, int b);

    default void displayMessage() {
        System.out.println("This is a functional interface for addition.");
    }

    static void display(int sum) {
        System.out.println("The addition of numbers is = " + sum);
    }

}
