import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Juan", "Pedro", "Luis", "Carlos", "Ana"};
        int count = nombres.length;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase("Luis") || nombres[i].equalsIgnoreCase("Carlos")) { //equalsIgnoreCase compara sin importar mayusculas o minusculas
                continue;
            }
            System.out.println(i + " " +nombres[i]);
        }

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese el nombre a buscar");
        boolean encontrado = false;
        for (String nombre : nombres) {
            if (nombre.equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null,"Nombre encontrado " + buscar);
        } else {
            JOptionPane.showMessageDialog(null, "Nombre no encontrado " + buscar);
        }

    }
}
