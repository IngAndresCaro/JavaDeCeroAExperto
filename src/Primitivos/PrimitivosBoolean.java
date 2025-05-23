package Primitivos;

public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        boolean datoLogico2 = false;
        System.out.println("datoLogico2 = " + datoLogico2);

        double d = 98765.43e-3; // 98.76543
        float f = 1.2345e2f; // 123.45

        datoLogico = d > f;
        System.out.println("datoLogico = " + datoLogico);

        datoLogico2 = d < f;
        System.out.println("datoLogico2 = " + datoLogico2);

        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);

        System.out.println("tipo boolean corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo boolean corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo " + Byte.MAX_VALUE);
        System.out.println("Valor minimo " + Byte.MIN_VALUE);


    }
}
