package Sentencias;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        int num = 1;
        switch (num) {
            case 1:
                System.out.println("El número es 1.");
                break;
            case 2:
                System.out.println("El número es 2.");
                break;
            case 3:
                System.out.println("El número es 3.");
                break;
            default:
                System.out.println("El número no es 1, 2 ni 3.");
        }

        char charType = '3';
        switch (charType) {
            case '1':
                System.out.println("El número es 1.");
                break;
            case '2':
                System.out.println("El número es 2.");
                break;
            case '3':
                System.out.println("El número es 3.");
                break;
            default:
                System.out.println("El número no es 1, 2 ni 3.");
        }

        String stringType = "admin";
        switch (stringType) {
            case "admin":
                System.out.println("El usuario es admin.");
                break;
            case "asesor":
                System.out.println("El usuario es asesor.");
                break;
            case "cliente":
                System.out.println("El usuario es cliente.");
                break;
            default:
                System.out.println("usuario desconocido.");
        }

    }
}
