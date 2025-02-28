import java.util.Scanner;

public class OperadoresLogicosLoginConTernario {
    public static void main(String[] args) {
        String[] usuarios = {"admin", "andres", "pepe"};
        String[] passwords = {"admin", "1234", "1234"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario: ");
        String usuarioIngresado = scanner.nextLine().toLowerCase();
        System.out.println("Ingrese el password: ");
        String passwordIngresado = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usuarios.length; i++) {
            esAutenticado = (usuarios[i].equals(usuarioIngresado) && passwords[i].equals(passwordIngresado)) ? true : esAutenticado;
        }

        String mensaje = (esAutenticado) ? "Bienvenido " + usuarioIngresado : "Usuario o password incorrecto";

        System.out.println(mensaje);

    }
}
