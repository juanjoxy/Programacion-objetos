import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la primera calificación: ");
        double cal1 = scanner.nextDouble();

        System.out.print("Ingresa la segunda calificación: ");
        double cal2 = scanner.nextDouble();

        System.out.print("Ingresa la tercera calificación: ");
        double cal3 = scanner.nextDouble();

        double suma = cal1 + cal2 + cal3;
        double promedio = suma / 3;

        double mayor = cal1;
        if (cal2 > mayor) {
            mayor = cal2;
        }
        if (cal3 > mayor) {
            mayor = cal3;
        }

        double menor = cal1;
        if (cal2 < menor) {
            menor = cal2;
        }
        if (cal3 < menor) {
            menor = cal3;
        }

        System.out.println("Suma de calificaciones: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación mayor: " + mayor);
        System.out.println("Calificación menor: " + menor);

        scanner.close();
    }
}
