import java.util.Scanner;

public class p050_ConversionTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            int tempInicial, tempFinal;

            do {
                System.out.print("Temperatura Inicial (°C): ");
                tempInicial = scanner.nextInt();

                System.out.print("Temperatura Final (°C): ");
                tempFinal = scanner.nextInt();

                if (tempFinal < tempInicial) {
                    System.out.println("Error: La temperatura final no puede ser menor que la inicial. Intenta de nuevo.\n");
                }

            } while (tempFinal < tempInicial);

            System.out.println("------------------------------------");
            System.out.println("Centígrados    Farenheit");
            System.out.println("------------------------------------");

            for (int c = tempInicial; c <= tempFinal; c++) {
                double f = (c * 9.0 / 5) + 32;
                System.out.printf("%-14d %.1f\n", c, f);
            }

            System.out.println("------------------------------------");

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next();
            System.out.println();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
