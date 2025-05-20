package Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operadores lógicos
        // && (AND) - Retorna verdadeiro se as duas condições forem verdadeiras
        // || (OR) - Retorna verdadeiro se pelo menos uma condição for verdadeira
        // ! (NOT) - Inverte o valor da condição

        int idade = 18;
        float salario = 1000;

        if (idade >= 18 && salario >= 1000) {
            System.out.println("Você pode financiar o carro!");
        } else {
            System.out.println("Você não pode financiar o carro!");
        }

        if (idade >= 18 || salario >= 1000) {
            System.out.println("Você pode financiar o carro!");
        } else {
            System.out.println("Você não pode financiar o carro!");
        }

        if (!(idade >= 18 && salario >= 1000)) {
            System.out.println("Você pode financiar o carro!");
        } else {
            System.out.println("Você não pode financiar o carro!");
        }

        boolean b4 = idade == salario || (salario < 1000 && idade > 18); // Primero evalua el and y luego el or
        System.out.println(b4);

        boolean b5 = true || true && false; // Primero evalua el and y luego el or
        System.out.println(b5);

        boolean b6 = (true || true) && false; //
        System.out.println(b6);

        boolean b7 = true || false && false || false;
        System.out.println(b7);

        boolean b8 = ((true || false) && false) || false;
        System.out.println(b8);
    }
}
