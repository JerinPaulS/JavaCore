package PrimitiveVariables;

public class IntegerMemoryCheck {

    public static void main(String[] args) {
        Integer a = 100;  // Cached
        Integer b = 100;  // Cached
        System.out.println(a == b);  // true (same memory location)

        Integer x = 200;  // Not cached
        Integer y = 200;  // Not cached
        System.out.println(x == y);  // false (different memory locations)

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));

        // Forcing new memory location (deprecated)
//        Integer s = new Integer(100);
//        Integer t = new Integer(100);
//        System.out.println(s == t);  // false (different memory locations)

        //java -Djava.lang.Integer.IntegerCache.high=200 IntegerMemoryCheck
    }

}
