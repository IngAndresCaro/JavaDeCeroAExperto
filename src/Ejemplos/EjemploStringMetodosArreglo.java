package Ejemplos;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();

        int cantidadDeCaracteres = arreglo.length;
        System.out.println("cantidadDeCaracteres = " + cantidadDeCaracteres);

        for (int i = 0; i < cantidadDeCaracteres; i++) {
            System.out.println("arreglo[i] = " + arreglo[i] + " i = " + (i+1));
        }
        for (int i = 0; i < cantidadDeCaracteres; i++) {
            System.out.print(arreglo[i]);
        }
        System.out.println();
        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int j = 0; j < l; j++) {
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("[.]"); //se puede tambien con \\.

        for (int i = 0; i < archivoArr.length; i++) {
            System.out.println(archivoArr[i]);
        }
        System.out.println("extension = " + archivoArr[archivoArr.length-1]);
    }

}
