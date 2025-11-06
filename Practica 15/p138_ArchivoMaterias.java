import java.io.*;
import java.util.Scanner;

public class p138_ArchivoMaterias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File arch = new File("materias.txt");

        try {
            BufferedWriter fmaterias = new BufferedWriter(new FileWriter(arch));
            System.out.println("Introduce una lista de materias cursadas (deja vacío y presiona Enter para terminar):");
            
            while (true) {
                System.out.print("Materia: ");
                String materia = sc.nextLine();
                if (materia.isEmpty()) break;
                fmaterias.write(materia + "\n");
            }

            fmaterias.close();
            System.out.println("\nLas materias fueron guardadas correctamente en el archivo.");

        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo.");
            System.out.println(e);
            return;
        }

        try {
            BufferedReader fmaterias = new BufferedReader(new FileReader(arch));
            String linea;
            System.out.println("\nMaterias almacenadas en el archivo:");
            while ((linea = fmaterias.readLine()) != null) {
                System.out.println(linea);
            }
            fmaterias.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo.");
            System.out.println(e);
        }

        System.out.println("\nLongitud final del archivo: " + arch.length() + " bytes");
    }
}
