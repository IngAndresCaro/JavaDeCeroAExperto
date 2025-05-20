package Sentencias;

public class SentenciaWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        boolean prueba = true;
        while (prueba) {
            if (i == 5) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        prueba = false;
        do {
            System.out.println("Ejecuta por lo menos una vez " + i);
            i++;
        } while (prueba);

        prueba = true;
        do {
            if (i == 5) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }while (prueba);
    }
}
