package Wrapper;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;

        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; // false
        Boolean objBoolean = Boolean.valueOf(primBoolean); // false
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = false;

        System.out.println("Primitive boolean: " + primBoolean);
        System.out.println("Object Boolean: " + objBoolean);
        System.out.println("Object Boolean2: " + objBoolean2);

        System.out.println("Comparando dos objetos boolean: " + (objBoolean == objBoolean2));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean.equals(objBoolean2)));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean2 == objBoolean3));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean==objBoolean3));
    }
}
