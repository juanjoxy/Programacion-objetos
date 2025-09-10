import java.util.Scanner;

public class TipoAngulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un ángulo entre 0 y 360 grados: ");
        int angulo = scanner.nextInt();

        if (angulo < 0 || angulo > 360) {
            System.out.println("Ángulo fuera de rango.");
        } else if (angulo < 90) {
            System.out.println("Ángulo agudo");
        } else if (angulo == 90) {
            System.out.println("Ángulo recto");
        } else if (angulo > 90 && angulo < 180) {
            System.out.println("Ángulo obtuso");
        } else if (angulo == 180) {
            System.out.println("Ángulo llano");
        } else if (angulo > 180 && angulo < 360) {
            System.out.println("Ángulo cóncavo");
        } else if (angulo == 360) {
            System.out.println("Ángulo completo");
        }

        scanner.close();
    }
}
