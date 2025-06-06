package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForInversoMutable {
    public static void arregloInverso(String[] productos) {
        int total = productos.length;
        int total2 = total / 2;
        for (int i = 0; i < total2; i++) {
            String actual = productos[i];
            String inverso = productos[total - 1 - i];
            productos[i] = inverso; // Modifica el arreglo original
            productos[total - 1 - i] = actual; // Modifica el arreglo original
        }
    }

    public static void main(String[] args) {

        String[] productos = {"Computadora", "Celular", "Tablet", "Monitor", "Teclado", "Mouse", "Audifonos"};
        int total = productos.length;

        Arrays.sort(productos); // Modifiza de la a - z

        System.out.println("=== Usando For ===");
        for(int i = 0; i < total; i++){
            System.out.println("productos[" + i + "] = " + productos[i]);
        }

        //Collections.reverse(Arrays.asList(productos)); // Modifiza de la z - a
        arregloInverso(productos); // Llama al método para invertir el arreglo

        System.out.println("=== Usando For ===");
        for(int i = 0; i < total; i++){
            System.out.println("productos[" +  i + "] = " + productos[i]);
        }

    }

}
