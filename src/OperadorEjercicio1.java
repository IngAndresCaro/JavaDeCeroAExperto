import javax.swing.*;

public class OperadorEjercicio1 {
    public static void main(String[] args) {
        try {
            String numeroUno = JOptionPane.showInputDialog(null, "Ingrese un numero: ");
            String numeroDos = JOptionPane.showInputDialog(null, "Ingrese un numero: ");
            String resultado = Integer.parseInt(numeroUno) > Integer.parseInt(numeroDos) ? "El número " + numeroUno + " es mayor que " + numeroDos : "El número " + numeroDos + " es mayor que " + numeroUno;
            JOptionPane.showMessageDialog(null, resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: debe ingresar un número entero.");
        }
    }
}
