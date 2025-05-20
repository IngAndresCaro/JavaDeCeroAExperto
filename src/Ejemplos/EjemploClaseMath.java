package Ejemplos;

public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-10);
        System.out.println("El valor absoluto de -10 es: " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("El valor absoluto de 3 es: " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("El valor máximo entre 3.5 y 1.2 es: " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("El valor mínimo entre 3.5 y 1.2 es: " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);


        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(3.5);
        System.out.println("redondeo = " + entero);

        long pi = Math.round(Math.PI);
        System.out.println("pi = " + pi);

        double exp = Math.exp(2);
        System.out.println("e^2 = " + exp);

        double log = Math.log(10);
        System.out.println("log(10) = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("10^3 = " + potencia);

        double raiz = Math.sqrt(16);
        System.out.println("raiz(16) = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("grados = " + grados);

        double radianes = Math.toRadians(90);
        System.out.println("grados a radianes = " + radianes);

        System.out.println("sin(90) = " + Math.sin(radianes));
        System.out.println("cos(90) = " + Math.cos(radianes));
        System.out.println("tan(90) = " + Math.tan(radianes));

        radianes = Math.toRadians(180);
        System.out.println("cos(180) = " + Math.cos(radianes));




    }
}
