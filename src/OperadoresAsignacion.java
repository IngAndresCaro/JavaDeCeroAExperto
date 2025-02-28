public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5; // el = es un valor de asignacion
        int j = i + 4; // el = es un valor de asignacion
        System.out.println(i);
        System.out.println(j);

        i += 2;//i = i +2; es lo mismo
        System.out.println(i);

        i += 5; // i = i + 5; es lo mismo
        System.out.println(i);

        j -= 4; // j = j - 4; es lo mismo
        System.out.println(j);

        j *= 2; // j = j * 2; es lo mismo
        System.out.println(j);

        String sqlString = "select * from clientes";
        sqlString += " where nombre = 'Juan'"; // sqlString = sqlString + " where nombre = 'Juan'";
        System.out.println(sqlString);


    }
}
