package FunctionalInterfaces;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        MyFunctionalInterface obj = () -> System.out.println("This is a functional interface example");
        obj.displayMessage();
    }

}
