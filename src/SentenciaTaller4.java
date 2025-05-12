import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class SentenciaTaller4 {
    public static void main(String[] args) {
        int opcionSeleccionada = 0;
        do {
            Map<String, Integer> opciones = new HashMap();

            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionSeleccionada = opciones.get(opcion.toString());
                switch (opcionSeleccionada) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Actualizo.");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Eliminar.");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Agregar.");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Listar.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Haz salido con exito!");
                }
            }
        } while (opcionSeleccionada != 5);
    }
}
