package Sentencias;

import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese un numero entero: ");
      //String numeroStr = scanner.nextLine();
      int numeroDecimal = 0;

      try {
        numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
      } catch (Exception e) {
        System.out.println("Error debe ingresar un numero entero " + e);
        main(args);
        System.exit(0);
      }

      System.out.println("numeroDecimal = " + numeroDecimal);
      System.out.println("numero binario = " + Integer.toBinaryString(numeroDecimal));
      System.out.println("numero octal = " + Integer.toOctalString(numeroDecimal));
      System.out.println("numero hexadecimal = " + Integer.toHexString(numeroDecimal));


    }
}
