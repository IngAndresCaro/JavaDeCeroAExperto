package Ejemplos;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        String curso3 = "programación java";

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual); //Son dos objetos diferentes
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual); //Son dos objetos con el mismo valor

        esIgual = curso.equalsIgnoreCase(curso3);
        System.out.println("curso.equalsIgnoreCase(curso3) = " + esIgual); //Son dos objetos con el mismo valor

        String curso4 = "Programación Java";

        esIgual = curso == curso4;
        System.out.println("curso == curso4 = " + esIgual); //Son dos objetos con el mismo valor
    }
}
