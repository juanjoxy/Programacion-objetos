public class p001_HolaMundo {
    public static void main(String[] args) {
        String amigo = "Adrián";

        String hermano = "Reynaldo";

        String mensaje = String.format("Tanto %s como %s desean aprender Java", hermano, amigo);

        System.out.println("Hola Mundo en el Lenguaje Java");
    System.out.println("\nHola amigo  " + amigo + " Bienvenido a Java. ");
    System.out.println("\nMi amigo es:  " + amigo + " Mi hermano es: " + hermano);
    System.out.println("\n" + mensaje);
    }
}