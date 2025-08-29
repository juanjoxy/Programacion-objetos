import java.util.Scanner;

public class AceptarEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la edad del estudiante: ");
        int edad = scanner.nextInt();

        System.out.print("Ingresa la primera calificación: ");
        double cal1 = scanner.nextDouble();

        System.out.print("Ingresa la segunda calificación: ");
        double cal2 = scanner.nextDouble();

        boolean mayorEdad = edad > 18;
        boolean calificacionesValidas = (cal1 > 8) && (cal2 > 8);

        if (mayorEdad && calificacionesValidas) {
            System.out.println("¡Bienvenido a la universidad!");
        } else {
            System.out.println("Ingreso rechazado por las siguientes razones:");

            if (!mayorEdad) {
                System.out.println("- No es mayor de 18 años.");
            }
            if (!calificacionesValidas) {
                System.out.println("- Las calificaciones deben ser mayores que 8.");
            }
        }

        scanner.close();
    }
}
