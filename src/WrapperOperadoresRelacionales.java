public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = 1000;
        Integer num2 = num1;

        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);

        System.out.println("son el mismo objeto? " + (num1 == num2));

        num2 = 1000;

        //con el numero 127 se crea un objeto en la memoria se compara por valor y si es mayor compara ´por el objeto

        System.out.println("son el mismo objeto? " + (num1 == num2));// compara por el oebjeto
        System.out.println("son el mismo objeto? " + (num1.equals(num2))); // compara por el valor
        System.out.println("son el mismo objeto? " + (num1.intValue() == num2.intValue())); // compara por el valor

        num2 = 500;
        boolean condicion = num1 > num2;
        System.out.println("num1 > num2 " + condicion);

        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("num1 > num2 " + condicion2);
    }
}
