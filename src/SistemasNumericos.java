public class SistemasNumericos {
    public static void main(String[] args) {
      int numeroDecimal = 500;
      System.out.println("numeroDecimal = " + numeroDecimal);
      System.out.println("numero binario de 500 = " + Integer.toBinaryString(numeroDecimal));

      int numeroBinario = 0b111110100;
      System.out.println("numeroBinario = " + numeroBinario);
      System.out.println("numero octal de 500 = " + Integer.toOctalString(numeroDecimal));

      int numeroOctal = 0764;
      System.out.println("numeroOctal = " + numeroOctal);
      System.out.println("numero hexadecimal de 500 = " + Integer.toHexString(numeroDecimal));

      int numeroHex = 0x1f4;
      System.out.println("numeroHex = " + numeroHex);

    }
}
