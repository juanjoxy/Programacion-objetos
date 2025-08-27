import java.util.Scanner;

public class OperacionesConUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("División: " + (num1 / num2));
            System.out.println("Módulo: " + (num1 % num2));
        } else {
            System.out.println("No se puede dividir ni calcular módulo entre 0.");
        }

        System.out.println("Potencia: " + Math.pow(num1, num2));

        scanner.close();
    }
}
