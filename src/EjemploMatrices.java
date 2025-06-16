public class EjemploMatrices {
    public static void main(String[] args) {
        int[][] matriz = new int[2][4];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;

        matriz[1][0] = 11;
        matriz[1][1] = 12;
        matriz[1][2] = 13;
        matriz[1][3] = 14;

        System.out.println("número de filas: " + matriz.length);
        System.out.println("número de columnas: " + matriz[0].length);

        System.out.println("Primer elemento: " + matriz[0][0]);
        System.out.println("ultimo elemento: " + matriz[matriz.length - 1][matriz[0].length - 1]);

        int num1 = matriz[0][0];
        int num2 = matriz[1][3];
        int num3 = matriz[1][0];
        int num4 = matriz[0][3];
        int num5 = matriz[1][1];
        int num6 = matriz[0][2];
        int num7 = matriz[1][2];
        int num8 = matriz[0][1];

        System.out.println("Suma de los elementos: " + (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8));
        System.out.println("Suma de los elementos: " + (matriz[0][0] + matriz[1][3] + matriz[1][0] + matriz[0][3] + matriz[1][1] + matriz[0][2] + matriz[1][2] + matriz[0][1]));



    }
}
