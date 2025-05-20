package Argumentos;

public class ArgumentosLineaComando {
    public static void main(String[] args) {

        //javac ArgumentosLineaComando.java -encoding utf8
        //java ArgumentosLineaComando Andres Pepe "Juan Grancisco"

        if (args.length == 0) {
            System.out.println("Debe ingresar argumentos o parámetros");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento nro : " + i + " = " + args[i]);
        }
    }
}
