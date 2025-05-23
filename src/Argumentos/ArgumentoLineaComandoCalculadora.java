package Argumentos;

public class ArgumentoLineaComandoCalculadora {
    public static void main(String[] args) {
        //javac ArgumentoLineaComandoCalculadora.java -encoding utf8
        //java ArgumentoLineaComandoCalculadora suma 5 10
        //java ArgumentoLineaComandoCalculadora resta 5 10
        //java ArgumentoLineaComandoCalculadora multi 5 10
        //java ArgumentoLineaComandoCalculadora div 5 10
        //java ArgumentoLineaComandoCalculadora raiz 5 10

        if (args.length != 3) {
            System.out.println("Uso: java ArgumentoLineaComandoCalculadora <operacion> <num1> <num2>");
            System.out.println("Operaciones disponibles: suma, resta, multi, div");
            System.out.println("Dos Enteros");

            System.exit(-1);
        }
        String operacion = args[0];

        try {
            int a = Integer.parseInt(args[1]);
            int b = Integer.parseInt(args[2]);
            double resultado = 0;

            switch (operacion){
                case "suma":
                    resultado = a + b;
                    System.out.println("La suma es: " + resultado);
                    break;
                case "resta":
                    resultado = a - b;
                    System.out.println("La resta es: " + resultado);
                    break;
                case "multi":
                    resultado = a * b;
                    System.out.println("La multiplicación es: " + resultado);
                    break;
                case "div":
                    if (b != 0) {
                        resultado = (double) a / b;
                        System.out.println("La división es: " + resultado);
                    } else {
                        System.out.println("Error: División por cero.");
                        System.exit(-1);
                    }
                    break;
                default:
                    System.out.println("Operación no válida.");
            }
        } catch (NumberFormatException e) {
            System.err.println("Error: Debe ingresar números enteros.");
            System.exit(-1);
        } catch (ArithmeticException e) {
            System.err.println("Error: División por cero.");
            System.exit(-1);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(-1);



        }

    }
}
