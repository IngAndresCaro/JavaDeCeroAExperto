public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.jpeg";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo = " + archivo.length());
        System.out.println("archivo = " + archivo.substring(14));
        System.out.println("archivo = " + archivo.substring(i+1));
    }
}
