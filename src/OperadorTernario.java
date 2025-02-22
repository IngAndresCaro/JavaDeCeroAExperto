import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        int numero = 10;
        String mensaje = (numero % 2 == 0) ? "Es par" : "Es impar";
        System.out.println(mensaje);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double fisica = 0.0;
        double quimica = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematicas: ");
        matematicas = scanner.nextDouble();
        System.out.println("Ingrese la nota de fisica: ");
        fisica = scanner.nextDouble();
        System.out.println("Ingrese la nota de quimica: ");
        quimica = scanner.nextDouble();

        promedio = (matematicas + fisica + quimica) / 3;

        estado = (promedio >= 6.5) ? "Aprobado" : "Desaprobado";
        System.out.println("Estado: " + estado);
        System.out.println("Promedio: " + promedio);



    }
}
