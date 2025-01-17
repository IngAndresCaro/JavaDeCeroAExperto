import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

      String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");
      int numeroDecimal = 0;

      try {
        numeroDecimal = Integer.parseInt(numeroStr);
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
        main(args);
        System.exit(0);
      }
      String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
      String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
      String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

      numeroDecimal = Integer.parseInt(numeroStr);
      System.out.println("numeroDecimal = " + numeroDecimal);
      System.out.println("numero binario = " + Integer.toBinaryString(numeroDecimal));

      int numeroBinario = 0b111110100;
      System.out.println("numeroBinario = " + numeroBinario);
      System.out.println("numero octal = " + Integer.toOctalString(numeroDecimal));

      int numeroOctal = 0764;
      System.out.println("numeroOctal = " + numeroOctal);
      System.out.println("numero hexadecimal = " + Integer.toHexString(numeroDecimal));

      int numeroHex = 0x1f4;
      System.out.println("numeroHex = " + numeroHex);

      String mensaje = resultadoBinario;
      mensaje += "\n" + resultadoOctal;
      mensaje += "\n" +  resultadoHex;

      JOptionPane.showMessageDialog(null, "numeroDecimal = " + mensaje);

    }
}
