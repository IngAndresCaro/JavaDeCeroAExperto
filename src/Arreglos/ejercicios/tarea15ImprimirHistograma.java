package Arreglos.ejercicios;

public class tarea15ImprimirHistograma {
    public static void main(String[] args) {
        //Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.
        //El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
        //Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6, incluso si no están presente en el arreglo.
        int[] numeros = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        int[] contador = new int[7]; // Contador para números del 1 al 6 (índices 0 a 6)
        // Contar ocurrencias de cada número
        for (int numero : numeros) {
            if (numero >= 1 && numero <= 6) {
                contador[numero]++;
            }
        }
        // Imprimir el histograma
        for (int i = 1; i <= 6; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < contador[i]; j++) {
                System.out.print("*"); // Imprimir un asterisco por cada ocurrencia
            }
            System.out.println(); // Nueva línea después de cada número
        }

    }
}
