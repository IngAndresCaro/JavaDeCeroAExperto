package Sentencias;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {
        bucle1: for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2){
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j +" ], ");
            }
        }
        System.out.println("==========================================");
        etiqueta: for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2){
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j +" ], ");
            }
        }
        System.out.println("==========================================");

        bucle2: for (int i = 1; i < 7; i++) {
            System.out.println();
            int j = 1;
            while (j<=8){
                if (i == 6 || i == 7){
                    continue bucle2;
                }
                System.out.print("[Dia = " + i + ", Hora = " + j +" ], ");
                j++;
            }
        }

    }
}
