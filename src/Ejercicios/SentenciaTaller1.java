package Ejercicios;

import java.util.Scanner;

public class SentenciaTaller1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[10];

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }
        System.out.println("El número menor es: " + menor);

        if (menor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }
    }
}
