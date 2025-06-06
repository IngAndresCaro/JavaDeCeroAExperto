package Arreglos;

import java.util.Arrays;

public class EjemploArreglos{
    public static void main(String[] args) {
        
        String[] productos = new String[7];
        productos[0] = "Computadora";
        productos[1] = "Celular";
        productos[2] = "Tablet";
        productos[3] = "Monitor";
        productos[4] = "Teclado";
        productos[5] = "Mouse";
        productos[6] = "Audifonos";

        Arrays.sort(productos); // Modifiza de la a - z

        String producto1 = productos[0];
        String producto2 = productos[1];
        String producto3 = productos[2];
        String producto4 = productos[3];
        String producto5 = productos[4];
        String producto6 = productos[5];
        String producto7 = productos[6];


        System.out.println("productos[0] = " + producto1);
        System.out.println("productos[1] = " + producto2);
        System.out.println("productos[2] = " + producto3);
        System.out.println("productos[3] = " + producto4);
        System.out.println("productos[4] = " + producto5);
        System.out.println("productos[5] = " + producto6);
        System.out.println("productos[6] = " + producto7);


        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int) 3L;
        numeros[3] = 40;
        numeros[4] = 50;
        //numeros[5] = 6; // Esto generará un ArrayIndexOutOfBoundsException

        Arrays.sort(numeros); // Modifiza de la 1 - 100

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];
        int o = numeros[numeros.length - 1]; // Acceso al último elemento del arreglo
        //int m = numeros[5]; // Esto generará un ArrayIndexOutOfBoundsException

        for(int numero : numeros){
            System.out.println(numero);
        }

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("o = " + o);
        System.out.println("l = " + l);



    }
}