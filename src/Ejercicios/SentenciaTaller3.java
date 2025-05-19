package Ejercicios;

import java.util.Scanner;

public class SentenciaTaller3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        boolean esPositivo = true;
        System.out.println("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = scanner.nextInt();
        if (num1 < 0) {
            esPositivo = false;
            num1 = -num1;
        }
        if (num2 < 0) {
            esPositivo = !esPositivo;
            num2 = -num2;
        }
        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }
        if (!esPositivo) {
            resultado = -resultado;
        }
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
