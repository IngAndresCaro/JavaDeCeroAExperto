import javax.swing.*;

/**
 * OperacionesEjercicio3
 */
public class OperacionesEjercicio3 {
    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null,"Vamos a mirar cual de los tres nombres es el mas largo");
            String nombreUno = JOptionPane.showInputDialog("Ingrese el primer nombre:");
            String nombreDos = JOptionPane.showInputDialog("Ingrese el segundo nombre:");
            String nombreTres = JOptionPane.showInputDialog("Ingrese el tercer nombre:");

            if (nombreUno.length() > nombreDos.length() && nombreUno.length() > nombreTres.length()) {
                JOptionPane.showMessageDialog(null, "El nombre " + nombreUno + " es el más largo.");
            }
            if (nombreDos.length() > nombreUno.length() && nombreDos.length() > nombreTres.length()) {
                JOptionPane.showMessageDialog(null, "El nombre " + nombreDos + " es el más largo.");
            }
            if (nombreTres.length() > nombreUno.length() && nombreTres.length() > nombreDos.length()) {
                JOptionPane.showMessageDialog(null, "El nombre " + nombreTres + " es el más largo.");
            }
            if (nombreTres.length() == nombreUno.length() && nombreTres.length() == nombreDos.length()) {
                JOptionPane.showMessageDialog(null, "Todos los nombres tienen la misma longitud.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
