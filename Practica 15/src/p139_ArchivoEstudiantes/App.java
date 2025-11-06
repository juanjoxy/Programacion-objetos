package p139_ArchivoEstudiantes;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        String archivo = "estudiantes.dat";
        ArrayList<Estudiante> datos = new ArrayList<>();

        do {
            System.out.print("\033[H\033[2J");
            System.out.println("===== Sistema de Estudiantes =====");
            System.out.println("1. Capturar datos");
            System.out.println("2. Grabar datos en archivo");
            System.out.println("3. Leer datos de archivo");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Calcular estadísticas");
            System.out.println("6. Salir");
            System.out.print("Elije opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    Procesa.capturaDatos(datos);
                    break;
                case 2:
                    try {
                        if (!datos.isEmpty()) {
                            Procesa.grabarDatos(archivo, datos);
                            System.out.println("\nDatos grabados correctamente.");
                        } else {
                            System.out.println("\nNo hay datos para grabar.");
                        }
                    } catch (Exception e) {
                        System.out.println("\nError al grabar el archivo.");
                    }
                    break;
                case 3:
                    try {
                        datos = Procesa.leerDatos(archivo);
                        System.out.println("\nDatos cargados correctamente.");
                    } catch (Exception e) {
                        System.out.println("\nError al leer el archivo.");
                    }
                    break;
                case 4:
                    if (!datos.isEmpty())
                        Procesa.mostrarDatos(datos);
                    else
                        System.out.println("\nNo hay datos para mostrar.");
                    break;
                case 5:
                    Procesa.calcularEstadisticas(datos);
                    break;
                case 6:
                    System.out.println("\nSaliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            System.out.println("\nPresiona Enter para continuar...");
            sc.nextLine(); sc.nextLine();
        } while (op != 6);
    }
}
