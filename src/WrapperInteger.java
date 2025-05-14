public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 126; // primitivo

        // esta deprecado Integer intObjeto = new Integer(10);
        Integer intObjeto = Integer.valueOf(intPrimitivo); // autoboxing implicitamente
        Integer intObjeto2 = intPrimitivo; // autoboxing
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto; // unboxing implicitamente
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue(); // unboxing
        System.out.println("num2 = " + num2);

        String valorTvLcd = "1000";
        Integer valorLcd = Integer.valueOf(valorTvLcd); // autoboxing
        System.out.println("valorLcd = " + valorLcd);

        Long longObjeto = intObjeto.longValue(); // primitivo
        System.out.println("longObjeto = " + longObjeto);// para que no de error colocar un valor menor a 9223372036854775807

        Short shortObjeto = intObjeto.shortValue(); // primitivo
        System.out.println("shortObjeto = " + shortObjeto);// para que no de error colocar un valor menor a 32768

        Byte byteObjeto = intObjeto.byteValue(); // primitivo
        System.out.println("byteObjeto = " + byteObjeto);// para que no de error colocar un valor menor a 127



    }
}
