import java.util.Scanner;

public class LeyDeNewton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo según la 2da Ley de Newton (F = m * a)");
        System.out.println("Elige qué quieres calcular:");
        System.out.println("1 - Fuerza (F)");
        System.out.println("2 - Masa (m)");
        System.out.println("3 - Aceleración (a)");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double fuerza, masa, aceleracion;

        switch (opcion) {
            case 1:
                System.out.print("Ingresa la masa (kg): ");
                masa = scanner.nextDouble();
                System.out.print("Ingresa la aceleración (m/s^2): ");
                aceleracion = scanner.nextDouble();
                fuerza = masa * aceleracion;
                System.out.printf("La fuerza es: %.2f N\n", fuerza);
                break;

            case 2:
                System.out.print("Ingresa la fuerza (N): ");
                fuerza = scanner.nextDouble();
                System.out.print("Ingresa la aceleración (m/s^2): ");
                aceleracion = scanner.nextDouble();
                if (aceleracion != 0) {
                    masa = fuerza / aceleracion;
                    System.out.printf("La masa es: %.2f kg\n", masa);
                } else {
                    System.out.println("Error: La aceleración no puede ser cero.");
                }
                break;

            case 3:
                System.out.print("Ingresa la fuerza (N): ");
                fuerza = scanner.nextDouble();
                System.out.print("Ingresa la masa (kg): ");
                masa = scanner.nextDouble();
                if (masa != 0) {
                    aceleracion = fuerza / masa;
                    System.out.printf("La aceleración es: %.2f m/s²\n", aceleracion);
                } else {
                    System.out.println("Error: La masa no puede ser cero.");
                }
                break;

            default:
                System.out.println("Opción inválida.");
                break;
        }

        scanner.close();
    }
}
