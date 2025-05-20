package Ejemplos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formmato 'yyyy-MM-dd': ");
        try {
            Date fecha = format.parse(scanner.nextLine());
            System.out.println("Fecha: " + fecha);
            System.out.println("Fecha formateada: " + format.format(fecha));

            Date fecha2 = new Date();

            if (fecha.after(fecha2)){
                System.out.println("Fecha (del usuario) ingresada es posterior a la fecha actual (actual)");
            } else if (fecha.before(fecha2)){
                System.out.println("Fecha (del usuario) ingresada es anterior a la fecha actual (actual)");
            } else {
                System.out.println("Fecha ingresada es igual a la fecha actual");
            }

            if(fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha (del usuario) ingresada es posterior a la fecha actual (actual)");
            } else if(fecha.compareTo(fecha2) < 0){
                System.out.println("Fecha (del usuario) ingresada es anterior a la fecha actual (actual)");
            } else {
                System.out.println("Fecha ingresada es igual a la fecha actual");
            }
        } catch (ParseException e) {
            //throw new RuntimeException(e);
            System.err.println("Error al parsear la fecha: " + e.getMessage());
            System.err.println("El formato debe ser 'yyyy-MM-dd'");
            //System.exit(1);
            main(args);
        }

    }
}
