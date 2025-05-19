package Ejercicios;

import java.util.Scanner;

public class SentenciaTaller2 {
    public static void main(String[] args) {
        //Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[20];

        System.out.println("Ingrese Notas entre 1 y 7:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
            try {
                if (valores[i] < 1 || valores[i] > 7) {
                    System.out.println("Nota fuera de rango, por favor ingrese una nota entre 1 y 7.");
                    i--; // Decrementar el índice para volver a pedir la nota
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
                i--; // Decrementar el índice para volver a pedir la nota
            }
        }

        //Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.
        double sumaMayor5 = 0;
        double sumaMenor4 = 0;
        int contadorMayor5 = 0;
        int contadorMenor4 = 0;
        int contadorUno = 0;
        double sumaTotal = 0;

        for (int i = 0; i < valores.length; i++) {
            sumaTotal += valores[i];
            if (valores[i] > 5) {
                sumaMayor5 += valores[i];
                contadorMayor5++;
            } else if (valores[i] < 4) {
                sumaMenor4 += valores[i];
                contadorMenor4++;
            }
            if (valores[i] == 1) {
                contadorUno++;
            }
        }
        double promedioTotal = sumaTotal / valores.length;
        double promedioMayor5 = (contadorMayor5 > 0) ? sumaMayor5 / contadorMayor5 : 0;
        double promedioMenor4 = (contadorMenor4 > 0) ? sumaMenor4 / contadorMenor4 : 0;
        System.out.println("Promedio de notas mayores a 5: " + promedioMayor5);
        System.out.println("Promedio de notas menores a 4: " + promedioMenor4);
        System.out.println("Cantidad de notas 1: " + contadorUno);
        System.out.println("Promedio total: " + promedioTotal);
        //Mostrar la cantidad de notas mayores a 5, menores a 4 y la cantidad de notas 1.
        System.out.println("Cantidad de notas mayores a 5: " + contadorMayor5);
        System.out.println("Cantidad de notas menores a 4: " + contadorMenor4);
        System.out.println("Cantidad de notas 1: " + contadorUno);
        //Mostrar el promedio total de las notas.
        System.out.println("Promedio total de las notas: " + promedioTotal);
        //Mostrar la cantidad de notas mayores a 5, menores a 4 y la cantidad de notas 1.
        System.out.println("Cantidad de notas mayores a 5: " + contadorMayor5);
        System.out.println("Cantidad de notas menores a 4: " + contadorMenor4);
        System.out.println("Cantidad de notas 1: " + contadorUno);
        //Mostrar el promedio total de las notas.
        System.out.println("Promedio total de las notas: " + promedioTotal);

    }
}
