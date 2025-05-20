package Sentencias;

public class SentenciaIfElse {
    public static void main(String[] args) {
        boolean expresion= true;// Siempre cambia de acuerdo a la logica
        if(expresion){
            System.out.println("La expresion es verdadera");
        }else{
            System.out.println("La expresion es falsa");
        }
        //Ejecutar un bloque de código si una condición es verdadera y otro bloque si es falsa
        int numero = 10;
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par");
        } else {
            System.out.println("El número " + numero + " es impar");
        }
        //Ejemplo 2
        float promedio = 6.5f;
        if(promedio >= 6.5){
            System.out.println("Aprobado");
        }else if(promedio >= 5.5){
            System.out.println("Aprobado con nota regular");
        }else if(promedio < 5.5) {
            System.out.println("Desaprobado");
        }
        System.out.println("Tu promedio es: " + promedio);
        //Ejemplo 3 siempre se recomienda usar llaves para evitar errores de interpretación del código pero se puede usar sin llaves
        float valor = 6.5f;
        if(valor >= 6.5)
            System.out.println("Aprobado");
        else
            System.out.println("Desaprobado");

    }
}
