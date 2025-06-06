package Arreglos.ejercicios;

public class tarea13OrdenarArregloultimoPrimero {
    public static void main(String[] args) {
        //Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos. Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente
        int[] numeros = new int[10];
        int[] ordenados = new int[10];
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                // Si el índice es par, tomamos del final
                ordenados[i] = numeros[numeros.length - 1 - (i / 2)];
            } else {
                // Si el índice es impar, tomamos del inicio
                ordenados[i] = numeros[i / 2];
            }
        }

        for (int i = 0; i < ordenados.length; i++) {
            System.out.println("Números ordenados "+ (i+1) + " : " + ordenados[i]);
        }

    }
}
