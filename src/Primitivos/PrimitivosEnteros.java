package Primitivos;

public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127; // maximo valor 127
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo " + Byte.MAX_VALUE);
        System.out.println("Valor minimo " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor maximo " + Short.MAX_VALUE);
        System.out.println("Valor minimo " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor maximo " + Integer.MAX_VALUE);
        System.out.println("Valor minimo " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor maximo " + Long.MAX_VALUE);
        System.out.println("Valor minimo " + Long.MIN_VALUE);

        var numeroVar = 9223372036854775809D; // ya en adelante son numeros demasiados grandes
        System.out.println("numeroVar = " + numeroVar);

    }
}
