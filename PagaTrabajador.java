import java.util.Scanner;

public class PagaTrabajador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa las horas trabajadas: ");
        double horas = scanner.nextDouble();

        System.out.print("Ingresa el pago por hora: ");
        double pagoPorHora = scanner.nextDouble();

        double pagaBruta = horas * pagoPorHora;

        double impuesto = pagaBruta * 0.30;

        double pagaNeta = pagaBruta - impuesto;

        System.out.printf("Paga bruta: %.2f%n", pagaBruta);
        System.out.printf("Impuesto (30%%): %.2f%n", impuesto);
        System.out.printf("Paga neta (después de impuestos): %.2f%n", pagaNeta);

        scanner.close();
    }
}
