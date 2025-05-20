package PasarPor;

public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Valor de i antes de llamar a la función: " + i);
        test(i);
        System.out.println("Valor de i después de llamar a la función: " + i);
    }

    public static void test(int i) {
        System.out.println("Valor de i dentro de la función: " + i);
        i = 20;
        System.out.println("Valor de i dentro de la función después de cambiarlo: " + i);
    }
}
