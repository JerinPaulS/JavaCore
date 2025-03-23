package PrimitiveVariables;

public class ParseIntVsValueOf {

    public static void main(String[] args) {
        int num1 = Integer.parseInt("100"); // int
        Integer num2 = Integer.valueOf("100"); // Integer

        System.out.println(num1 + 10); // 110
        System.out.println(num2 + 10); // 110
    }

}
