public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            //curso = "Programación Java";
            curso = " ";
            System.out.println(curso.toUpperCase());

        }

        boolean esVacio = curso.length() == 0;


        boolean esvacio2 = curso.isEmpty();

        if (!esVacio || !esvacio2){
            //System.out.println("Bienvenido al curso ".concat(curso)); // sacara error por que curso es null
            System.out.println("Bienvenido al curso "+ curso); // sacara error por que curso es null pero no rompe el programa
        }

        boolean esBlanco = curso.isBlank();

        if(esBlanco){
            System.out.println("curso esta en blanco");
        }
        System.out.println("curso está vacío");

    }
}
