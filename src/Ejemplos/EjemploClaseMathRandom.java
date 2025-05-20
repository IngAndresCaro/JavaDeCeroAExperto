package Ejemplos;

import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        
        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Naranja", "Violeta", "Rosa"};
        double randon = Math.random();
        System.out.println("Math.random() = " + randon);

        randon *= colores.length;
        System.out.println("Math.random() * 7 = " + randon);

        randon = Math.floor(randon);
        System.out.println("Math.floor(Math.random() * 7) = " + randon);

        System.out.println("colores[(int) randon] = " + colores[(int) randon]);

        Random randomObj = new Random();
        int randomInt0 = 15 + randomObj.nextInt(25 - 15 + 1);
        int randomInt = randomObj.nextInt();
        long randomInt2 = randomObj.nextInt();
        System.out.println("randomObj.nextInt(7) = " + randomInt0);
        System.out.println("random.nextInt(7) = " + randomInt);
        System.out.println("random.nextInt(7) = " + randomInt2);
        
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("Colores[] = " + colores[randomInt]);



    }

}
