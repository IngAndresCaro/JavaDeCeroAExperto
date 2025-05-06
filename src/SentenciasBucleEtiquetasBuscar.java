public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "Hola, soy un texto de ejemplo Java. Estoy aquí para ayudarte a aprender Java.";
        String palabra = "Java";
        char letra = 'a';

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;
        int cantidad = 0;

        buscar:
        for (int i = 0; i <= maxFrase; ) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado " + cantidad + " la palabra " + palabra);}
}
