public class OperadoresUnarios {
    public static void main(String[] args) {
        int i = -5;
        int j = +5; //J = (1)*5 => 5
        System.out.println("j = " + j);

        int k = -i; //k = (-1)*(-5) => 5
        System.out.println("k = " + k);

        i=6;
        j=+i; //j = (1)*6 => 6
        System.out.println("j = " + j);

        k=-i; //k = (-1)*6 => -6
        System.out.println("k = " + k);
        //Se utilizan los valores unarios para invertir el numero
    }
}
