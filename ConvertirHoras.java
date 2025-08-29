import java.util.Scanner;

public class ConvertirHoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de horas: ");
        double horas = scanner.nextDouble();

        if (horas < 0) {
            System.out.println("La cantidad de horas no puede ser negativa.");
        } else {
            double dias = horas / 24;
            double minutos = horas * 60;
            double segundos = minutos * 60;

            System.out.printf("Equivalente en días: %.2f días\n", dias);
            System.out.printf("Equivalente en minutos: %.2f minutos\n", minutos);
            System.out.printf("Equivalente en segundos: %.2f segundos\n", segundos);
        }

        scanner.close();
    }
}
