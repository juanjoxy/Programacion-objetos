import java.util.Scanner;

public class p091_MayoresPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de calificaciones: ");
        int n = scanner.nextInt();

        float[] calificaciones = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación #" + (i + 1) + ": ");
            calificaciones[i] = scanner.nextFloat();
        }

        System.out.println("\nCalificaciones ingresadas:");
        for (float cal : calificaciones) {
            System.out.print(cal + " ");
        }
        System.out.println();

        float suma = 0;
        for (float cal : calificaciones) {
            suma += cal;
        }

        float promedio = suma / n;
        System.out.println("\nSuma de calificaciones: " + suma);
        System.out.println("Promedio de calificaciones: " + promedio);

        int contadorMayores = 0;
        System.out.println("\nCalificaciones mayores al promedio:");
        for (float cal : calificaciones) {
            if (cal > promedio) {
                System.out.print(cal + " ");
                contadorMayores++;
            }
        }

        System.out.println("\nCantidad de calificaciones mayores al promedio: " + contadorMayores);
        
        scanner.close();
    }
}
