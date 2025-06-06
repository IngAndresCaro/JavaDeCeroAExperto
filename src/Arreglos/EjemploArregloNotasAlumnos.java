package Arreglos;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas, claseHistoria,ClaseLenguaje;
        double sumatoriaMatematicas = 0, sumatoriaHistoria = 0, sumatoriaLenguaje = 0;
        int estudiantes = 7;
        claseMatematicas = new double[estudiantes];
        claseHistoria = new double[estudiantes];
        ClaseLenguaje = new double[estudiantes];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese las notas de la clase de matemáticas:");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = s.nextDouble();
        }
        System.out.println("Ingrese las notas de la clase de historia:");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = s.nextDouble();
        }
        System.out.println("Ingrese las notas de la clase de lenguaje:");
        for (int i = 0; i < ClaseLenguaje.length; i++) {
            ClaseLenguaje[i] = s.nextDouble();
        }

        for (int i = 0; i < estudiantes; i++) {
            sumatoriaMatematicas += claseMatematicas[i];
            sumatoriaHistoria += claseHistoria[i];
            sumatoriaLenguaje += ClaseLenguaje[i];

        }

        double promedioMatematicas = (double) sumatoriaMatematicas / estudiantes;
        double promedioHistoria = (double) sumatoriaHistoria / estudiantes;
        double promedioLenguaje = (double) sumatoriaLenguaje / estudiantes;
        double promedioGeneral = (promedioMatematicas + promedioHistoria + promedioLenguaje) / 3;

        System.out.println("Promedio de notas en matemáticas: " + promedioMatematicas);
        System.out.println("Promedio de notas en historia: " + promedioHistoria);
        System.out.println("Promedio de notas en lenguaje: " + promedioLenguaje);
        System.out.println("Promedio general de notas: " + promedioGeneral);

        System.out.println("Ingrese el identificador del alumno para ver sus notas (de 0- 6):");
        int identificador = s.nextInt();
        double promedioAlumno = (claseMatematicas[identificador] + claseHistoria[identificador] + ClaseLenguaje[identificador]) / 3;
        System.out.println("El promedio del alumno con identificador " + identificador + " es: " + promedioAlumno);

    }
}
