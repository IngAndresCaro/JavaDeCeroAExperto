package Sentencias;

public class SentenciaCicloFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        for (int o = 10; o >= 0; o--) {
            System.out.println("o = " + o);
        }

        for (int a = 1, u = 10; a < u; a++, u--) {
            System.out.println(a + " = " + u);
        }

        for(int i = 0; i < 10; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println("i = " + i);
        }

        for(int i = 0; i < 10; i++){
            if (i % 2 != 0){
                continue;
            }
            System.out.println("i = " + i);
        }

        int e = 0;
        for (;;) {
            if (e > 10){
                break;
            }
            System.out.println("e = " + e);
            e++;
        }

    }
}
