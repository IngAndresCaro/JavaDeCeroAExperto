package Arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt(); // Leer un número del usuario
        }
        System.out.println("Ingrese un número a buscar:");
        int numeroABuscar = scanner.nextInt(); // Leer el número a buscar
        int i = 0;
        while(i < numeros.length && numeros[i] != numeroABuscar) {
            i++; // Incrementar el índice hasta encontrar el número o llegar al final del arreglo
        }
        if(i == numeros.length) {
            System.out.println("El número " + numeroABuscar + " no se encuentra en el arreglo.");
        } else if(numeros[i] == numeroABuscar) {
            System.out.println("El número " + numeroABuscar + " se encuentra en la posición " + i + ".");
        }

    }
}
