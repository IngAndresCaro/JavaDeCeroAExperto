public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 1;
        byte j = 2;
        float k = 3.0f;
        double l = 4.0;
        boolean m = false;
        
        boolean b1 = i == j; // false
        System.out.println("b1 = " + b1);

        boolean b2 = !b1;
        System.out.println("b2 = " + b2);

        boolean b3 = i != j; // true
        System.out.println("b3 = " + b3);

        boolean b4 = i < j; // true
        System.out.println("b4 = " + b4);

        boolean b5 = i > j; // false
        System.out.println("b5 = " + b5);

        boolean b6 = m == true; // false
        System.out.println("b6 = " + b6);

        boolean b7 = m != true; // true
        System.out.println("b7 = " + b7);

        boolean b8 = i <= j; // true
        System.out.println("b8 = " + b8);

        boolean b9 = i >= j; // false
        System.out.println("b9 = " + b9);

        boolean b10 = k >= l; // false
        System.out.println("b10 = " + b10);

        boolean b11 = k <= l; // true
        System.out.println("b11 = " + b11);



    }
}
