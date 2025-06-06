package Arreglos;

public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] numeros2 = new int[10];

        System.out.println("=== Imprimer numeros ===" );
        for (int i = 0; i <numeros.length ; i++) {
            numeros[i] = i + 1; // Asignar valores del 1 al 10
        }

        for (int i = 0; i < numeros.length/2; i++) {
            System.out.print(numeros[i] + " ");
            System.out.println(numeros[numeros.length - 1 - i ] + " ");
        }

        for (int i = 0; i < numeros.length -i; i++) {
            System.out.print(numeros[i] + " ");
            System.out.println(numeros[numeros.length - 1 - i ] + " ");
        }
        System.out.println("=== Imprimer numeros2 ===" );
        int auxiliar = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros2[auxiliar] = numeros[i];
            numeros2[auxiliar++] = numeros[numeros.length - 1 - i];
        }
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("i = " + i + " valor = " + numeros2[i]);
        }

    }
}
