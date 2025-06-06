package Arreglos;

import java.util.Arrays;
/**
 * Ejemplo de uso de arreglos en Java con diferentes tipos de bucles.
 * Este programa crea un arreglo de productos, los ordena alfabéticamente
 * y los imprime utilizando diferentes estructuras de control: for, foreach,
 * while y do-while.
 */
public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "Computadora";
        productos[1] = "Celular";
        productos[2] = "Tablet";
        productos[3] = "Monitor";
        productos[4] = "Teclado";
        productos[5] = "Mouse";
        productos[6] = "Audifonos";

        System.out.println("=== Usando For ===");
        Arrays.sort(productos); // Modifiza de la a - z
        for(int i = 0; i < total; i++){
            System.out.println("productos[" + i + "] = " + productos[i]);
        }
        System.out.println("=== Usando Foreach ===");
        for (String producto : productos){
            System.out.println("producto = " + producto);
        }
        System.out.println("=== Usando while ===");
        int i = 0;
        while (i < total){
            System.out.println("productos[" + i + "] = " + productos[i]);
            i++;
        }
        System.out.println("=== Usando DoWhile ===");
        int j = 0;
        do {
            System.out.println("productos[" + j + "] = " + productos[j]);
            j++;
        } while (j < total);

        int[] numeros = new int[10];
        for (int k = 0; k < numeros.length; k++) {
            numeros[k] = k + 1; // Asignar valores del 1 al 10
        }
        System.out.println("=== Imprimiendo numeros ===");
        for (int numero : numeros) {
            System.out.println("numero = " + numero);
        }
    }

}
