package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String[] productos = new String[7];
        String[] productos = {"Computadora", "Celular", "Tablet", "Monitor", "Teclado", "Mouse", "Audifonos"};
        int total = productos.length;

        /*productos[0] = "Computadora";
        productos[1] = "Celular";
        productos[2] = "Tablet";
        productos[3] = "Monitor";
        productos[4] = "Teclado";
        productos[5] = "Mouse";
        productos[6] = "Audifonos";*/

        System.out.println("=== Usando For ===");
        Arrays.sort(productos); // Modifiza de la a - z
        for(int i = 0; i < total; i++){
            System.out.println("productos[" + i + "] = " + productos[i]);
        }
        System.out.println("=== Usando For Inverso ===");
        for(int i = total - 1; i >= 0; i--){
            System.out.println("productos[" + i + "] = " + productos[i]);
        }
        System.out.println("=== Usando For Inverso 2 ===");
        for(int i = 0; i < total; i++){
            System.out.println("productos[" + (total - 1 - i) + "] = " + productos[total - 1 - i]);
        }

    }

}
