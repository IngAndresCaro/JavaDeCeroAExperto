public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '@';
        System.out.println("caracter = " + caracter);

        char decimal = 64; // 64 en ASCII es @
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '\u0040'; // 64 en hexadecimal es 40
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        System.out.println("char corresponte en byte = " + Character.BYTES);
        System.out.println("char corresponte en bits = " + Character.SIZE);
        System.out.println("Valor máximo de un char: " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un char: " + Character.MIN_VALUE);
    }
}
