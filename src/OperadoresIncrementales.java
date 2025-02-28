public class OperadoresIncrementales {
    public static void main(String[] args) {
        // pre incremento
        int i = 1;
        int j = ++i; // i = 2, j = 2
        System.out.println("i = " + i + ", j = " + j);

        // post incremento
        i = 2;
        j = i++; // i = 1, j = 1
        System.out.println("i = " + i + ", j = " + j);

        // pre decremento
        i = 2;
        j = --i; // i = 1, j = 1
        System.out.println("i = " + i + ", j = " + j);

        //post decremento
        i = 4;
        j = i--; // i = 3, j = 4
        System.out.println("i = " + i + ", j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + (j));



    }
}
