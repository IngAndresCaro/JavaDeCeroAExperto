package Sentencias;

public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};
        for(int numero: numeros){
            System.out.println("numero = " + numero);
        }

        String[] nombres = {"Juan", "Pedro", "Luis", "Carlos", "Ana"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
