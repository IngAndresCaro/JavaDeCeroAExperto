package Ejemplos;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Andrés";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUppercase( = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("numbre.equals(\"Andrés\") = " + nombre.equals("Andrés"));
        System.out.println("nombre.equals(\"Andrés\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo (\"Andres\") = "+ nombre.compareTo("Andrés"));
        System.out.println("nombre.compareTo (\"Andres\") = "+ nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length()" + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring() = " + nombre.substring(1, 4));
        System.out.println("nombre.substring() = " + nombre.substring(4, 6));
        System.out.println("nombre.substring(nombre) = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \"A\") = " + trabalenguas.replace("a", "A"));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf('z'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.contains(\"T\") = " + trabalenguas.contains("T"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());;


    }

}
