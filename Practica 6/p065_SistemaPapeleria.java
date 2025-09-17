import java.util.Scanner;

/**
 * Programa para controlar la venta de fotocopias en una papelería.
 * Calcula las ventas por tipo de copia, totaliza y muestra un resumen con mensaje
 * según el monto total vendido.
 *
 * Juan José Iñiguez de la cruz
 * Fecha: 13/09/2025
 */
public class p065_SistemaPapeleria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para contar ventas y acumulados
        int ventaNumero = 1;
        int cantidadCarta = 0, cantidadOficio = 0, cantidadDobleOf = 0;
        int totalVentas = 0;
        int totalPrecioCarta = 0, totalPrecioOficio = 0, totalPrecioDobleOf = 0;

        final int precioCarta = 3;
        final int precioOficio = 4;
        final int precioDobleOf = 6;

        System.out.println("---------------------------------");
        System.out.println("Papelería la Malena, SA. de CV.");
        System.out.println("Sistema de ventas de copias");
        System.out.println("---------------------------------");

        // Ciclo para registrar ventas hasta que el usuario diga no
        while (true) {
            System.out.println("Venta: " + ventaNumero);
            System.out.print("Tipo de copia (C)arta $3,(O)ficio $4,(D)oble Of $6? ");
            char tipo = scanner.next().toUpperCase().charAt(0);

            System.out.print("Cantidad ? ");
            int cantidad = scanner.nextInt();

            switch (tipo) {
                case 'C':
                    cantidadCarta += cantidad;
                    totalPrecioCarta += cantidad * precioCarta;
                    break;
                case 'O':
                    cantidadOficio += cantidad;
                    totalPrecioOficio += cantidad * precioOficio;
                    break;
                case 'D':
                    cantidadDobleOf += cantidad;
                    totalPrecioDobleOf += cantidad * precioDobleOf;
                    break;
                default:
                    System.out.println("Tipo de copia inválido. Intente de nuevo.");
                    continue; // Repite la misma venta sin incrementar ventaNumero
            }

            totalVentas += cantidad;
            ventaNumero++;

            System.out.print("Otra venta (S/N) ? ");
            char otraVenta = scanner.next().toUpperCase().charAt(0);
            if (otraVenta != 'S') {
                break;
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("Resumen diario de ventas");
        System.out.println("---------------------------------------");
        System.out.println("Ventas realizadas: " + (ventaNumero - 1));
        System.out.println("-------------------------");
        System.out.println("Carta : " + cantidadCarta + " - $ " + totalPrecioCarta);
        System.out.println("Oficio : " + cantidadOficio + " - $ " + totalPrecioOficio);
        System.out.println("Doble Of. : " + cantidadDobleOf + " - $ " + totalPrecioDobleOf);
        System.out.println("-------------------------");

        int totalVentaDinero = totalPrecioCarta + totalPrecioOficio + totalPrecioDobleOf;
        System.out.println("Tot. Ventas : " + totalVentas + " - $ " + totalVentaDinero);

        // Mostrar mensaje según la venta total
        if (totalVentaDinero < 50) {
            System.out.println("Esta venta es una : venta moderada");
        } else if (totalVentaDinero <= 100) {
            System.out.println("Esta venta es una : venta frecuente");
        } else {
            System.out.println("Esta venta es una : venta superada");
        }

        scanner.close();
    }
}
