import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("El área del triángulo es: %.2f%n", area);

        scanner.close();
    }
}
