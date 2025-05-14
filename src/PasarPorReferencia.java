public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad = {10, 11 ,12};
        System.out.println("Iniciamos metodo main: " + edad);
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Valor de edad[" + i + "] antes de llamar a la función: " + edad[i]);
        }
        System.out.println("Valor de i antes de llamar a la función: " + edad);
        test(edad);
        System.out.println("Valor de i después de llamar a la función: " + edad);
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Valor de edad[" + i + "] antes de llamar a la función: " + edad[i]);
        }
        System.out.println("Finaliza el metodo main con los datos modificados!");
    }

    public static void test(int[] edadArr) {
        System.out.println("Valor de i dentro de la función: ");
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] = edadArr[i] + 20;
        }
        System.out.println("Valor de i dentro de la función después de cambiarlo: ");
    }
}
