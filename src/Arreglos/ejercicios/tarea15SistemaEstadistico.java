package Arreglos.ejercicios;

public class tarea15SistemaEstadistico {
    public static void main(String[] args) {

        //Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos, el promedio de los negativos y contar el número de ceros.
        int[] numeros = new int[7];
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if(numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        double promedioPositivos = contadorPositivos > 0 ? (double) sumaPositivos / contadorPositivos : 0;
        double promedioNegativos = contadorNegativos > 0 ? (double) sumaNegativos / contadorNegativos : 0;

        System.out.println("Promedio de números positivos: " + promedioPositivos);
        System.out.println("Promedio de números negativos: " + promedioNegativos);
        System.out.println("Número de ceros: " + contadorCeros);

    }
}
