package PrimitiveVariables;

public class CompareValues {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(a == b);  // true

        int a1 = 500;
        int b1 = 500;
        System.out.println(a1 == b1);

        Integer x = 5;
        Integer y = 5;
        System.out.println(x.equals(y));  // true
        System.out.println(x == y); // true (due to Integer caching for values -128 to 127)

        Integer m = 200;
        Integer n = 200;
        System.out.println(m == n); // false (no caching for values > 127)
        System.out.println(m.compareTo(n));
        System.out.println(m.equals(n));
    }

}
