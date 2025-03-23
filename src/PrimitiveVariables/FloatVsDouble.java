package PrimitiveVariables;

public class FloatVsDouble {

    public static void main(String[] args) {
        float f = 1.0000001f;
        double d = 1.0000000000000001;

        System.out.println(f); // 1.0000001
        System.out.println(d); // 1.0 (Precision loss)
    }

}
