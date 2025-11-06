package p139_ArchivoEstudiantes;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesa {

    public static void capturaDatos(ArrayList<Estudiante> datos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIntroduce los datos de un estudiante (nombre vacío para terminar):");
        while (true) {
            Estudiante e = new Estudiante();
            System.out.print("\nNombre: ");
            e.setNombre(sc.nextLine());
            if (e.getNombre().isEmpty()) break;
            System.out.print("Edad: ");
            e.setEdad(sc.nextInt());
            System.out.print("Promedio: ");
            e.setPromedio(sc.nextDouble());
            sc.nextLine();
            System.out.print("Sexo (H/M): ");
            e.setSexo(sc.nextLine().toUpperCase());
            datos.add(e);
        }
    }

    public static void grabarDatos(String archivo, ArrayList<Estudiante> datos) throws IOException {
        FileOutputStream fos = new FileOutputStream(archivo);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(datos);
        oos.close();
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Estudiante> leerDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Estudiante> datos;
        FileInputStream fis = new FileInputStream(archivo);
        ObjectInputStream ois = new ObjectInputStream(fis);
        datos = (ArrayList<Estudiante>) ois.readObject();
        ois.close();
        return datos;
    }

    public static void mostrarDatos(ArrayList<Estudiante> datos) {
        System.out.println("\nListado de estudiantes:");
        for (Estudiante e : datos) {
            System.out.println(e);
        }
    }

    public static void calcularEstadisticas(ArrayList<Estudiante> datos) {
        if (datos.isEmpty()) {
            System.out.println("\nNo hay datos cargados.");
            return;
        }

        double sumaPromedios = 0, sumaEdades = 0;
        int hombres = 0, mujeres = 0;

        for (Estudiante e : datos) {
            sumaPromedios += e.getPromedio();
            sumaEdades += e.getEdad();
            if (e.getSexo().equalsIgnoreCase("H")) hombres++;
            else if (e.getSexo().equalsIgnoreCase("M")) mujeres++;
        }

        double promedioCalificaciones = sumaPromedios / datos.size();
        double promedioEdades = sumaEdades / datos.size();

        System.out.println("\n===== Estadísticas Generales =====");
        System.out.printf("Promedio general de calificaciones: %.2f\n", promedioCalificaciones);
        System.out.printf("Promedio de edades: %.2f\n", promedioEdades);
        System.out.println("Cantidad de hombres: " + hombres);
        System.out.println("Cantidad de mujeres: " + mujeres);
    }
}
