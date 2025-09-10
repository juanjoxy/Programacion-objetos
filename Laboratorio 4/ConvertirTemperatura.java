import java.util.Scanner;

public class ConvertirTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en grados Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * (5.0 / 9.0);

        System.out.printf("La temperatura en grados Celsius es: %.2f°C\n", celsius);

        scanner.close();
    }
}
