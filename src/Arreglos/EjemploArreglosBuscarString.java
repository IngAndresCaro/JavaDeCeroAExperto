package Arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {

        String[] texto = new String[4];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 4 nombres:");
        for (int i = 0; i < texto.length; i++) {
            texto[i] = scanner.next(); // Leer un número del usuario
        }
        System.out.println("Ingrese un número a buscar:");
        String palabraABuscar = scanner.next(); // Leer el número a buscar
        int i = 0;
        while(i < texto.length && !texto[i].equalsIgnoreCase(palabraABuscar)) {
            i++; // Incrementar el índice hasta encontrar el número o llegar al final del arreglo
        }
        // Verificar si se encontró el número
        if(i == texto.length) {
            System.out.println("El número " + palabraABuscar + " no se encuentra en el arreglo.");
        } else if(texto[i].toLowerCase().contentEquals(palabraABuscar.toLowerCase())) {
            System.out.println("El número " + palabraABuscar + " se encuentra en la posición " + i + ".");
        }

    }
}
