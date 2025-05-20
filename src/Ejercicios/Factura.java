package Ejercicios;

import javax.swing.*;

public class Factura {
    public static void main(String[] args) {
        Double suma = 0.0;
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Ingrese el valor del producto (escriba 'Calcular' para terminar): ");
            if (input.equalsIgnoreCase("Calcular")) {
                break;
            }
            try {
                int valorProducto = Integer.parseInt(input);
                suma += valorProducto;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: debe ingresar un número entero o 'Calcular' para terminar.");
            }
        }
        Double iva = suma*0.19;
        JOptionPane.showMessageDialog(null, "Total = " + suma);
        JOptionPane.showMessageDialog(null, "Total IVA = " + iva);
        JOptionPane.showMessageDialog(null, "Total con IVA = " + (suma+iva));

    }
}