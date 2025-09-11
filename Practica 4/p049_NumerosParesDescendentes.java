import java.util.Scanner;

public class p049_NumerosParesDescendentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Ingresa un número entero (menor o igual a 100): ");
            int n = scanner.nextInt();

            int suma = 0;
            int contador = 0;

            System.out.print("Números pares entre 100 y " + n + ": ");
            for (int i = 100; i >= n; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    suma += i;
                    contador++;
                }
            }

            System.out.println();
            System.out.println("La suma: " + suma);

            if (contador > 0) {
                double promedio = (double) suma / contador;
                System.out.println("El promedio: " + promedio);
            } else {
                System.out.println("No hay números pares en el rango.");
            }

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
