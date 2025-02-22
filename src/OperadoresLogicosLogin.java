import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        /*String[] usuarios = new String[3];
        String[] passwords = new String[3];

        usuarios[0] = "admin";
        passwords[0] = "admin";

        usuarios[1] = "andres";
        passwords[1] = "1234";

        usuarios[2] = "pepe";
        passwords[2] = "1234";*/

        String[] usuarios = {"admin", "andres", "pepe"};
        String[] passwords = {"admin", "1234", "1234"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario: ");
        String usuarioIngresado = scanner.nextLine().toLowerCase();
        System.out.println("Ingrese el password: ");
        String passwordIngresado = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equals(usuarioIngresado) && passwords[i].equals(passwordIngresado)) {
                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado) {
            System.out.println("Bienvenido " + usuarioIngresado);
        } else {
            System.out.println("Usuario o password incorrecto");
        }
    }
}
