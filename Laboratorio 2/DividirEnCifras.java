import java.util.Scanner;

public class DividirEnCifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir un número de 3 cifras
        System.out.print("Ingresa un número entero de 3 cifras: ");
        int numero = scanner.nextInt();

        // Verificar que el número tenga exactamente 3 cifras (positivas)
        if (numero >= 100 && numero <= 999) {
            int centenas = numero / 100;
            int decenas = (numero / 10) % 10;
            int unidades = numero % 10;

            int suma = centenas + decenas + unidades;

            System.out.println("Centenas: " + centenas);
            System.out.println("Decenas: " + decenas);
            System.out.println("Unidades: " + unidades);
            System.out.println("Suma de los dígitos: " + suma);
        } else {
            System.out.println("Error: El número debe tener exactamente 3 cifras positivas (entre 100 y 999).");
        }

        scanner.close();
    }
}
