package Ejemplos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("Fecha y hora actual: " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy 'Hoy es' EEEE");
        String fechaFormateada = df.format(fecha);
        System.out.println("Fecha formateada: " + fechaFormateada);

        long j = 0;
        for (int i = 0; i<1000000; i++) {
            j += i;
        }
        System.out.println("j =" + j);

        Date fecha2 = new Date();
        long tiemporFinal = fecha2.getTime()-fecha.getTime();
        System.out.println("tiempo transcurrido en el for " + tiemporFinal + " milisegundos");


    }
}
