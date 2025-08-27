import java.util.Scanner;

public class CalculoTrigonometrico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un ángulo en radianes: ");
        double radianes = scanner.nextDouble();

        double seno = Math.sin(radianes);
        double coseno = Math.cos(radianes);
        double tangente = Math.tan(radianes);

        System.out.println("Seno: " + seno);
        System.out.println("Coseno: " + coseno);
        System.out.println("Tangente: " + tangente);

        scanner.close();
    }
}
