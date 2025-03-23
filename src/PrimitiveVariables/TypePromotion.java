package PrimitiveVariables;

public class TypePromotion {

    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        // byte c = a + b; // Compilation error
        int c = a + b; // Byte promotes to int
        System.out.println(c);
    }

}
