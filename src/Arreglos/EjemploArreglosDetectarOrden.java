package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 7 numeros:");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < a.length -1 ; i++) {
            if(a[i]> a[i+1]){
                descendente = true;
            }
            if (a[i]< a[i+1]){
                ascendente = true;
            }

        }

        if(ascendente && descendente){
            System.out.println("Arreglo = Desordenado");
        }

        if (!ascendente && !descendente) {
            System.out.println("Arreglo = todos son iguales");
        }

        if (ascendente && !descendente) {
            System.out.println("Arreglo = Ascendente");
        }

        if (!ascendente && descendente) {
            System.out.println("Arreglo = Descendente");
        }

    }

}
