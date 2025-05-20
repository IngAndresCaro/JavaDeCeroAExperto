package Ejercicios;

import java.util.Scanner;

public class Tarea12CalcularElAreaDeUnCIrculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo: ");
        double radioIngresado = scanner.nextDouble();
        double area = Math.PI*Math.pow(radioIngresado, 2);

        System.out.println("Area = " + Math.floor(area));
    }
}
