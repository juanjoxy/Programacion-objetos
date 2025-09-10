import java.util.Scanner;

public class CalcularAngulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer ángulo (en grados): ");
        double angulo1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo ángulo (en grados): ");
        double angulo2 = scanner.nextDouble();

        if (angulo1 <= 0 || angulo2 <= 0 || (angulo1 + angulo2) >= 180) {
            System.out.println("Los ángulos ingresados no forman un triángulo válido.");
        } else {
            double angulo3 = 180 - (angulo1 + angulo2);

            System.out.printf("El tercer ángulo es: %.2f grados\n", angulo3);
        }

        scanner.close();
    }
}
