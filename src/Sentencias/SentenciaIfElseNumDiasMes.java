package Sentencias;

import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {
        try {
            int numeroDias = 0;
            int year = 0;
            int mes = 0;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el mes: ");
            mes = scanner.nextInt();
            System.out.println("Ingrese el año: ");
            year = scanner.nextInt();


            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                numeroDias = 31;
                System.out.println("El mes " + mes + " tiene " + numeroDias + " días.");
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                numeroDias  = 30;
                System.out.println("El mes " + mes + " tiene " + numeroDias + " días.");
            } else if (mes == 2 && year > 0) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    numeroDias = 29;
                    System.out.println("El mes " + mes + " tiene " + numeroDias + "  días.");
                }
                if (year % 4 != 0) {
                    numeroDias = 28;
                    System.out.println("El mes " + mes + " tiene " + numeroDias + " días.");
                }
            } else {
                System.out.println("El mes " + mes + " no es válido.");
            }
        } catch (Exception e) {
            System.out.println("Error: debe ingresar un número entero.");
        }
    }
}
