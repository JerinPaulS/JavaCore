package PrimitiveVariables;

public class FloatingPointError {

    public static void main(String[] args) {
        double a = 0.1 + 0.2;
        System.out.println(a == 0.3); // false
        System.out.println(a); // 0.30000000000000004
    }

}
