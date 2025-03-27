package FunctionalInterfaces;

public class MethodReferenceExample {

    static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Printer obj = MethodReferenceExample::printMessage;
        obj.print("This is method referencing example.");
    }

}
