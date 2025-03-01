public class SentenciaBubleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "tres tristes tigres tragan trigo en un trigal trigotrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra + 1;

        int contador = 0;
        char letra = 'g';
        buscar : for (int i = 0; i < maxFrase; ) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if(frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            contador++;
            i = i + maxPalabra;
        }
        System.out.println("Se encontro la palabra " + contador + " de veces ");
    }
}
