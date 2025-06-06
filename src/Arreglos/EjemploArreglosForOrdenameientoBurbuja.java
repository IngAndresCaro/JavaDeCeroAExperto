package Arreglos;

public class EjemploArreglosForOrdenameientoBurbuja {
    public static void arregloInverso(String[] productos) {
        int total = productos.length;
        int total2 = total / 2;
        for (int i = 0; i < total2; i++) {
            String actual = productos[i];
            String inverso = productos[total - 1 - i];
            productos[i] = inverso; // Modifica el arreglo original
            productos[total - 1 - i] = actual; // Modifica el arreglo original
        }
    }

    public static void sortBurbuja(Object[] arreglo) {
        int total = arreglo.length;
        int contador = 0;

        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if ( ((Comparable)arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
            contador++;
        }
        System.out.println("contador = " + contador);


    }

    public static void main(String[] args) {

        String[] productos = {"Computadora", "Celular", "Tablet", "Monitor", "Teclado", "Mouse", "Audifonos"};

        System.out.println("=== Usando For con Burbuja ===");
        sortBurbuja(productos);

        for(int i = 0; i < productos.length; i++){
            System.out.println("productos[" +  i + "] = " + productos[i]);
        }

        System.out.println("=== Usando For con Burbuja en enteros===");

        Integer[] numeros = new Integer[5];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int) 3L;
        numeros[3] = 40;
        numeros[4] = -1;

        sortBurbuja(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros = " + numeros[i]);
        }


    }

}
