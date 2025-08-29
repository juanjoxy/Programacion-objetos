import java.util.Scanner;

public class HipotenusaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor del primer cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Ingresa el valor del segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.printf("La hipotenusa es: %.2f\n", hipotenusa);

        scanner.close();
    }
}
