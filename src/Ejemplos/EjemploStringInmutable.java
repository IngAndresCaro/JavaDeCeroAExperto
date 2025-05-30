package Ejemplos;

public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        curso.concat(profesor);
        System.out.println("curso = " + curso);

        String resultado = curso.concat(profesor);
        System.out.println("resultado = " + resultado);
        System.out.println(resultado == curso);

        String resyltado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("resyltado2 = " + resyltado2);

        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado = " + resultado3);


    }
}
