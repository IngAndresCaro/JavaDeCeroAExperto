public class ConversionDeTipos {
    public static void main(String[] args) {
        String numero = "10";
        // Convertir un String a un int
        int numeroEntero = Integer.parseInt(numero);
        System.out.println("numeroInt "+numeroEntero);

        String numeroDecimal = "10111.5e-3";
        // Convertir un String a un double
        double numeroDecimalDoble = Double.parseDouble(numeroDecimal);
        System.out.println("numeroDecimalDoble "+numeroDecimalDoble);

        String logico = "true";
        // Convertir un String a un boolean
        boolean logicoBoolean = Boolean.parseBoolean(logico);
        System.out.println("logicoBoolean "+logicoBoolean);

        int otroNumero = 20;
        // Convertir un int a un String
        String otroNumeroString = Integer.toString(otroNumero);
        System.out.println("otroNumeroString "+otroNumeroString);

        otroNumeroString = String.valueOf(otroNumero+10);
        System.out.println("otroNumeroString "+otroNumeroString);

        double otroRealDouble = 20234.5e2;
        String otroReal = Double.toString(otroRealDouble);
        System.out.println("otroReal "+otroReal);

        otroReal = String.valueOf(1.2345e2f);
        System.out.println("otroReal "+otroReal);

        int i = 10000;
        short s = (short)i;
        long l = i;
        System.out.println("s "+s);
        System.out.println("l "+l);
        char c = (char)i;
        System.out.println("c "+c);
        float f = i;
        System.out.println("f "+f);

    }
}
