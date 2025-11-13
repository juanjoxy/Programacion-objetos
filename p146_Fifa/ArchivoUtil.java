import java.io.*;
import java.util.ArrayList;

public class ArchivoUtil {
    public static void guardar(ArrayList<Jugador> lista, File archivo) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(lista);
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Jugador> cargar(File archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Jugador>) in.readObject();
        }
    }
}
