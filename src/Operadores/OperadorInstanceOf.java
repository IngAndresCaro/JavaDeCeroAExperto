package Operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        Integer numero = 10;
        Boolean bandera = true;

        System.out.println("texto es instancia de String: " + (texto instanceof String));
        System.out.println("numero es instancia de Integer: " + (numero instanceof Integer));
        System.out.println("bandera es instancia de Boolean: " + (bandera instanceof Boolean));

        Boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo string b1: " + b1);
        b1 = texto instanceof Object; // todos los tipos de datos son instancias de Object
        System.out.println("texto es del tipo objeto: " + b1);

        b1 = numero instanceof Integer; // todos los tipos de datos son instancias de Object
        System.out.println("numero es del tipo Integer: " + b1);

        b1 = numero instanceof Number; // todos los tipos de datos son instancias de Object
        System.out.println("numero es del tipo Number: " + b1);

        b1 = numero instanceof Object; // todos los tipos de datos son instancias de Object
        System.out.println("numero es del tipo Object: " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double: " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number: " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean: " + b1);

    }
}
