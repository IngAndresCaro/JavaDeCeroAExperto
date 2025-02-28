public class OperadoresPrecedencia {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        double promedio = (a + b + c) / 3d;
        System.out.println("Promedio: " + promedio);

        double resultado = a + b + c / 3d * 2; //(a + b + ((c / 3d) * 2)
        System.out.println("Resultado: " + resultado);

        resultado = ++a + b-- + c / 3d * 2; //(11 + 20 + ((30 / 3d) * 2)
        System.out.println("Resultado: " + resultado);
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }
}
