import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class p137_ArchivoDeportes {
    public static void main(String[] args) {
        String[] deportes = {
            "Fútbol",
            "Béisbol",
            "Ciclismo",
            "Atletismo",
            "Natación",
            "Motociclismo"
        };

        File arch = new File("deportes.txt");

        try {
            BufferedWriter fdeportes = new BufferedWriter(new FileWriter(arch));
            for (String deporte : deportes) {
                fdeportes.write(deporte + "\n");
            }
            fdeportes.close();
            System.out.println("Los datos fueron escritos correctamente en el archivo.");
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo.");
            System.out.println(e);
            return;
        }

        try {
            BufferedReader fdeportes = new BufferedReader(new FileReader(arch));
            String linea;
            System.out.println("\nContenido del archivo:");
            while ((linea = fdeportes.readLine()) != null) {
                System.out.println(linea);
            }
            fdeportes.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo.");
            System.out.println(e);
        }

        System.out.println("\nLongitud final del archivo: " + arch.length() + " bytes");
    }
}
