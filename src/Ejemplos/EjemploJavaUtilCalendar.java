package Ejemplos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        //calendar.set(2020, 03,25, 19, 20,10); // Establece la fecha al 25 de enero de 2020
        calendar.set(Calendar.YEAR, 2020); // Establece el año
        calendar.set(Calendar.MONTH, Calendar.APRIL); // Establece el mes (0-11)
        calendar.set(Calendar.DAY_OF_MONTH, 25); // Establece el día del mes
        //calendar.set(Calendar.HOUR_OF_DAY, 19); // Establece la hora (0-23)
        calendar.set(Calendar.HOUR, 7); // Establece la hora (0-11)
        calendar.set(Calendar.AM_PM, Calendar.PM); // Establece AM o PM
        calendar.set(Calendar.MINUTE, 20); // Establece los minutos
        calendar.set(Calendar.SECOND, 10); // Establece los segundos
        calendar.set(Calendar.MILLISECOND, 150); // Establece los milisegundos
        Date fecha = calendar.getTime();
        System.out.println("Fecha sin Fomato: " + fecha);

        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaFormateada = format.format(fecha);
        System.out.println("Fecha formateada: " + fechaFormateada);

        Calendar calActual = Calendar.getInstance();
        Date fecha2 = calActual.getTime();

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
    }
}
