package Operadores;

import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        int suma = i + j;

        System.out.println("Suma: " + suma);
        System.out.println("i + j " + i + j); // Concatena los valores
        System.out.println("i + j " + (i + j)); // Se puede usar paréntesis para forzar la suma
        System.out.println(i + j + "i + j"); // siempre se pasa de izquierda a derecha

        int resta = i - j;
        System.out.println("Resta: " + resta);
        System.out.println("(i - j = " + (i - j));

        int multiplicacion = i * j;
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("(i * j = " + (i * j));

        int division = i / j;
        float divisionFloat = (float) i / j;
        System.out.println("División: " + division);
        System.out.println("División float: " + divisionFloat);

        int resto = i % j;
        System.out.println("Módulo: " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        if (numero%2 == 0){
            System.out.println("El número " + numero + " es par");
        } else {
            System.out.println("El número " + numero + " es impar");
        }

    }
}
