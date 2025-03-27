package FunctionalInterfaces;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        MathOperation obj = (a, b) -> a + b;
        System.out.println("Addition = " + obj.add(10, 15));
        obj.displayMessage();
        MathOperation.display(obj.add(1000, 500));
    }

}
