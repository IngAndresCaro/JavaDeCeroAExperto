public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            //c = c.concat(a).concat(b).concat("\n"); //113ms->10000 bueno para cuando son pocos datos
            c += a + b + "\n"; //68ms->10000 25ms=>500 bueno para cuando son muchos datos
            //sb.append(a); sb.append(b); sb.append("\n"); //6ms->10000 0ms=>500
        }
        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio);
        System.out.println("c = "+ c);
        //System.out.println("sb = "+ sb.toString());


    }
}
