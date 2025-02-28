public class Main {
    public static void main (String[] args) {
        //Reglas para nombrar una variable en Java
        //1. Pueden comenzar con letra, guion bajo o signo de dolar
        //2. No pueden comenzar con numeros
        //3. No pueden ser una palabra reservada
        //4. No pueden contener espacios
        //5. No pueden contener simbolos especiales
        //6. No pueden contener guion medio

        String saludar = "Hola Mundo!";
        String miNombre = "Soy Andres mucho gusto :D!";
        int numero = 10;
        var numero2 = 10;
        boolean valor = true;

        System.out.println(saludar);
        System.out.println(miNombre);

        if (valor) {
            System.out.println("valor = " + numero);
            System.out.println("valor = " + numero2);
            numero = 5;
        }
        System.out.println("valor = " + numero);

    }
}