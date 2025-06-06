package Arreglos.ejercicios;

public class tarea16MayorOcurrencia {
    public static void main(String[] args) {
        //Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el arreglo.
        int[] numeros = {1, 2, 3, 3, 5, 5, 5, 6, 7};
        int[] contador = new int[10]; // Contador para números del 1 al 9
        // Contar ocurrencias de cada número
        for (int numero : numeros) {
            if (numero >= 1 && numero <= 9) {
                contador[numero]++;
            }
        }
        for (int i = 0; i < contador.length; i++) {
            System.out.println("Contador de ocurrencias: "+ contador[i]);
        }
        // Encontrar el número con más ocurrencias
        int maxOcurrencias = 0;
        int numeroMasOcurrencias = -1;
        for (int i = 1; i <= 9; i++) {
            if (contador[i] > maxOcurrencias) {
                maxOcurrencias = contador[i];
                numeroMasOcurrencias = i;
            }
        }
        // Imprimir el resultado
        if (numeroMasOcurrencias != -1) {
            System.out.println("El número con más ocurrencias es: " + numeroMasOcurrencias);
            System.out.println("Cantidad de veces que aparece: " + maxOcurrencias);
        } else {
            System.out.println("No se encontraron números en el rango de 1 a 9.");
        }


    }
}
