package Arreglos.ejercicios;

public class tarea14ImprimirNumeroMasAltoArreglo {
    public static void main(String[] args) {
        //Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
        int[] numeros = new int[7];
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Ingrese 7 números enteros entre 11 y 99:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            // Validar que el número esté en el rango 11 a 99
            while (numeros[i] < 11 || numeros[i] > 99) {
                System.out.print("Número inválido. Ingrese un número entre 11 y 99: ");
                numeros[i] = scanner.nextInt();
            }
        }


        int numeroMasAlto = numeros[0]; // Inicializamos con el primer elemento del arreglo
        boolean repetido = false;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeroMasAlto) {
                numeroMasAlto = numeros[i]; // Actualizamos el número más alto
                repetido = false; // Reseteamos la bandera de repetición
            } else if (numeros[i] == numeroMasAlto) {
                repetido = true; // Si encontramos un número igual, marcamos como repetido
            }
        }
        if (repetido) {
            System.out.println("El número más alto es: " + numeroMasAlto + " (se repite en el arreglo)");
        } else {
            System.out.println("El número más alto es: " + numeroMasAlto);
        }
    }
}
