import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {
    public static void main(String[] args) {
        try {
            int numeroDias = 0;
            int year = 0;
            int mes = 0;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el mes: ");
            mes = scanner.nextInt();
            System.out.println("Ingrese el año: ");
            year = scanner.nextInt();


            switch(mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numeroDias = 31;
                    System.out.println("El mes " + mes + " tiene " + numeroDias + " días.");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numeroDias  = 30;
                    System.out.println("El mes " + mes + " tiene " + numeroDias + " días.");
                    break;
                case 2:
                    if (year > 0) {
                        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                            numeroDias = 29;
                            System.out.println("El mes " + mes + " tiene " + numeroDias + "  días.");
                        }
                        if (year % 4 != 0) {
                            numeroDias = 28;
                            System.out.println("El mes " + mes + " tiene " + numeroDias + " días.");
                        }
                    }
                    break;
                default:
                    System.out.println("El mes " + mes + " no es válido.");

            }
        } catch (Exception e) {
            System.out.println("Error: debe ingresar un número entero.");
        }
    }
}
