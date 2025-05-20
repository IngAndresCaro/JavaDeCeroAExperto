package Ejemplos;

import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            //FileInputStream archivo = new FileInputStream("src/config.properties");
            FileInputStream archivo = new FileInputStream("src/config.properties2");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

            System.setProperties(p);

            Properties ps = System.getProperties();

            System.out.println("ps.getProperty(...) =" +ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.autor.email"));

            ps.list(System.out);
        } catch (Exception e) {
            //System.out.println("No existe el archivo" + e);
            System.err.println("No existe el archivo" + e);
            System.exit(1);

        }

    }
}
