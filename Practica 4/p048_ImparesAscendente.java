import java.util.Scanner;

public class p048_ImparesAscendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Ingresa un número entero positivo: ");
            int n = scanner.nextInt();

            int suma = 0;
            int contador = 0;

            System.out.print("Números impares entre 1 y " + n + ": ");
            for (int i = 1; i <= n; i += 2) {
                System.out.print(i + " ");
                suma += i;
                contador++;
            }

            System.out.println();
            System.out.println("La suma: " + suma);

            if (contador > 0) {
                double promedio = (double) suma / contador;
                System.out.println("El promedio: " + promedio);
            } else {
                System.out.println("No hay números impares en el rango.");
            }

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
