import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola Mundo";

        Class strClass = texto.getClass();

        System.out.println("strClass: " + strClass.getName());
        System.out.println("strClass: " + strClass.getSimpleName());
        System.out.println("strClass: " + strClass.getPackageName());
        System.out.println("strClass: " + strClass);

        for (Method metodo: strClass.getMethods()) {
            System.out.println("metodo: " + metodo.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass: " + intClass.getName());
        System.out.println("intClass: " + intClass.getPackageName());
        System.out.println("intClass: " + intClass.getSuperclass().getSuperclass());

        for (Method metodo: intClass.getMethods()) {
            System.out.println("metodo: " + metodo.getName());
        }

    }
}
