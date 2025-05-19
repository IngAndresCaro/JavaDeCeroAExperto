package Ejercicios;

import javax.swing.*;
import java.util.Calendar;

public class Tarea01Edades {
    public static void main(String[] args) {

        Calendar fechaActual = Calendar.getInstance();

        try {
            String fechaDeNacimiento = JOptionPane.showInputDialog(null,
                    "Ingrese su fecha de nacimiento (dd/MM/yyyy):",
                    "Fecha de Nacimiento",
                    JOptionPane.INFORMATION_MESSAGE);

            if (fechaDeNacimiento == null || fechaDeNacimiento.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: no se ingresó una fecha.");
                return;
            }

            String[] fechaSeparada = fechaDeNacimiento.split("/");
            if (fechaSeparada.length != 3) {
                JOptionPane.showMessageDialog(null, "Error: formato de fecha incorrecto. Use dd/MM/yyyy.");
                return;
            }

            int dia = Integer.parseInt(fechaSeparada[0]);
            int mes = Integer.parseInt(fechaSeparada[1]);
            int anio = Integer.parseInt(fechaSeparada[2]);

            int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);
            int mesActual = fechaActual.get(Calendar.MONTH) + 1; // Los meses empiezan en 0
            int anioActual = fechaActual.get(Calendar.YEAR);

            // Validar que la fecha ingresada sea lógica
            if (anio > anioActual || (anio == anioActual && mes > mesActual) ||
                    (anio == anioActual && mes == mesActual && dia > diaActual)) {
                JOptionPane.showMessageDialog(null, "Error: la fecha ingresada es futura.");
                return;
            }

            // Calcular la edad
            int edadAnios = anioActual - anio;
            int edadMeses = mesActual - mes;
            int edadDias = diaActual - dia;

            if (edadMeses < 0) {
                edadAnios--;
                edadMeses += 12;
            }

            if (edadDias < 0) {
                edadMeses--;
                Calendar mesAnterior = Calendar.getInstance();
                mesAnterior.set(anioActual, mesActual - 2, 1); // Mes anterior
                int diasMesAnterior = mesAnterior.getActualMaximum(Calendar.DAY_OF_MONTH);
                edadDias += diasMesAnterior;
            }

            String edad = "Años: " + edadAnios + ", Meses: " + edadMeses + ", Días: " + edadDias;
            JOptionPane.showMessageDialog(null, "Edad: " + edad);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: debe ingresar números enteros válidos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: ocurrió un problema. Verifique la fecha ingresada.");
        }
    }
}