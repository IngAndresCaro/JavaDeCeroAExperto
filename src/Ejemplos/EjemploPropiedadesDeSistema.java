package Ejemplos;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {
        String userName = System.getProperty("user.name");
        System.out.println("El nombre de usuario es: " + userName);

        String home = System.getProperty("user.home");
        System.out.println("home: " + home);

        String workSpace = System.getProperty("user.dir");
        System.out.println("workSpace: " + workSpace);

        String java = System.getProperty("java.version");
        System.out.println("java: " + java);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator: " + lineSeparator + "Esto es una prueba de salto de línea" + lineSeparator2 + "Esto es otra prueba de salto de línea" + lineSeparator2 + "Esto es una tercera prueba de salto de línea");


    }
}
