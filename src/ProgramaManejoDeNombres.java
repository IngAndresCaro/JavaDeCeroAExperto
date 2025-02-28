import javax.swing.*;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        //Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
        StringBuilder nombresArray = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese un nombre: ");
            try {
                nombre = nombre.substring( 1);
                //Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula
                nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
                //se le concatena un punto y los dos últimos caracteres de la persona.
                nombre = nombre.substring(0, 1) +  "." + nombre.substring(nombre.length()-2);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: debe ingresar un nombre válido.");
                i--;
                continue;
            }
            nombresArray.append(nombre).append("_");
        }
        JOptionPane.showMessageDialog(null, "Nombres = " + nombresArray);


    }
}
