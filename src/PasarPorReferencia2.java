class Persona{
    private String nombre;

    public void modificarNombre(String nuevonombre) {
        this.nombre = nuevonombre;
    }

    public String leerNombre() {
        return nombre;
    }

}


public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("Juan");

        System.out.println("Iniciamos metodo main");
        System.out.println("Persona SinModificar" + persona.leerNombre());
        test(persona);
        System.out.println("Persona modificada: " + persona.leerNombre());
        System.out.println("Finaliza el metodo main con los datos modificados!");
    }

    public static void test(Persona persona) {
        persona.modificarNombre("Pedro");
    }
}
