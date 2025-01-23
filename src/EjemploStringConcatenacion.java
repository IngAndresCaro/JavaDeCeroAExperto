public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el profesor " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 3;
        int numeroB = 4;
        System.out.println(detalle+ " " + numeroA + numeroB );
        System.out.println(detalle+ " " + (numeroA + numeroB) );
        System.out.println(numeroA + numeroB + " " + detalle);

        String detalle2 = curso.concat(" con ".concat(profesor)).concat(" en la mañana");
        System.out.println("detalle2 = " + detalle2);

    }
}
