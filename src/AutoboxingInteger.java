public class AutoboxingInteger {
    public static void main(String[] args) {

        Integer[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int suma = 0;

        for (Integer i : numeros) {
            if (i.intValue() % 2 == 0) {
                suma += i.intValue();
            }
        }

        System.out.println("La suma de los números pares es: " + suma);
        suma = 0;

        for (Integer i : numeros) {
            if (i % 2 == 0) {
                suma += i.intValue();
            }
        }

        System.out.println("La suma de los números pares es: " + suma);
    }

}
