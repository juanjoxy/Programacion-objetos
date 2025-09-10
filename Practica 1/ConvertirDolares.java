import java.util.Scanner;

public class ConvertirDolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad en pesos: ");
        double pesos = scanner.nextDouble();

        System.out.print("Ingresa la cotización actual del dólar: ");
        double cotizacionDolar = scanner.nextDouble();

        if (pesos < 0 || cotizacionDolar <= 0) {
            System.out.println("La cantidad en pesos y la cotización deben ser mayores a cero.");
        } else {
            double dolares = pesos / cotizacionDolar;

            System.out.printf("El equivalente en dólares es: %.2f USD\n", dolares);
        }

        scanner.close();
    }
}
