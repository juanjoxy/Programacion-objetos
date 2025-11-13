import java.util.ArrayList;

public class GestorJugadores {
    private ArrayList<Jugador> jugadores;
    private int indiceActual = 0;

    public GestorJugadores() {
        jugadores = new ArrayList<>();
    }

    public ArrayList<Jugador> getJugadores() { return jugadores; }

    public Jugador getActual() {
        if (jugadores.isEmpty()) return null;
        return jugadores.get(indiceActual);
    }

    public void siguiente() {
        if (!jugadores.isEmpty()) indiceActual = (indiceActual + 1) % jugadores.size();
    }

    public void anterior() {
        if (!jugadores.isEmpty()) indiceActual = (indiceActual - 1 + jugadores.size()) % jugadores.size();
    }

    public void agregar(Jugador j) {
        jugadores.add(j);
        indiceActual = jugadores.size() - 1;
    }

    public void eliminarActual() {
        if (!jugadores.isEmpty()) {
            jugadores.remove(indiceActual);
            if (indiceActual >= jugadores.size()) indiceActual = 0;
        }
    }

    public void limpiar() {
        jugadores.clear();
        indiceActual = 0;
    }
}
