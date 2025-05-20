package Primitivos;

public class PrimitivosFloat {

    static float varFlotante;

    public static void main(String[] args) {
        float realFloat = 2.12e3f; // 2.12 * 10^3;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tamaño en bits de float: " + Float.SIZE);
        System.out.println("Tamaño en bytes de float: " + Float.BYTES);
        System.out.println("Valor máximo de float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de float: " + Float.MIN_VALUE);

        // Double
        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tamaño en bits de Double: " + Double.SIZE);
        System.out.println("Tamaño en bytes de Double: " + Double.BYTES);
        System.out.println("Valor máximo de Double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de Double: " + Double.MIN_VALUE);

        System.out.println("varFlotante = " + varFlotante);
        varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
