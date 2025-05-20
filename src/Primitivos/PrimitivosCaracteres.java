package Primitivos;

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

        char escpacio = ' ';
        char espacioCionWiniCode = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponte en byte =" + escpacio + Character.BYTES);
        System.out.println("char"+ nuevaLinea +  "corresponte en bits ="+ espacioCionWiniCode + Character.SIZE);
        System.out.println("Valor" + retornoCarro + " máximo de un char:"+ retroceso + Character.MAX_VALUE);
        System.out.println("Valor "+ System.getProperty("line.separator")+"mínimo de" +System.lineSeparator() +"un char: " + tabulador + Character.MIN_VALUE);
    }
}
