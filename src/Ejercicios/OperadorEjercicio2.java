package Ejercicios;

import java.util.Scanner;

public class OperadorEjercicio2 {
    public static void main(String[] args) {

        Integer capacidadTanque = 0;
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Ingrese la capacidad del tanque de gasolina en litros: ");
            capacidadTanque = Integer.parseInt(scanner.nextLine());
            System.out.println("El tanque de gasolina tiene una capacidad de " + capacidadTanque + " litros.");
            System.out.println("El tanque de gasolina puede recorrer " + capacidadTanque * 10 + " km.");
            if (capacidadTanque == 70 ){
                System.out.println("El tanque de gasolina está lleno.");
            }
            if (capacidadTanque < 70 && capacidadTanque >= 60){
                System.out.println("El tanque de gasolina casi lleno.");
            }
            if (capacidadTanque < 60 && capacidadTanque >= 40){
                System.out.println("El tanque de gasolina está 3/4.");
            }
            if (capacidadTanque < 40 && capacidadTanque >= 35){
                System.out.println("El tanque de gasolina está Medio Estanque.");
            }
            if (capacidadTanque < 35 && capacidadTanque >= 20){
                System.out.println("El tanque de gasolina está Suficiente");
            }
            if (capacidadTanque < 20 && capacidadTanque > 0){
                 System.out.println("El tanque de gasolina está Insuficiente");
            }
            if (capacidadTanque == 0){
                System.out.println("El tanque de gasolina está casi vacio");
            }

        }  catch (NumberFormatException e) {
            System.out.println("Error: debe ingresar un número entero.");
        }
    }
}
