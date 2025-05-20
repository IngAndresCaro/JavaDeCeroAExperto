import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        Process proceso = null;
        try {
            if(System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = runtime.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                proceso = runtime.exec("textedit");
            }else if (System.getProperty("os.name").toLowerCase().contains("nux") ||
                       System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = runtime.exec("gedit");
            }

            proceso.waitFor();
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1); // 1 indica que ha habido un error
        }
        System.out.println("Se a cerrado el editor");
        System.exit(0); // 0 indica que el programa se ha cerrado correctamente

    }
}
