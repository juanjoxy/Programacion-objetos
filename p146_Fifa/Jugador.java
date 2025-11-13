import java.io.Serializable;
import java.time.LocalDate;

public class Jugador implements Serializable {
    private String nombre;
    private String nacionalidad;
    private double peso;
    private LocalDate fechaNacimiento;
    private String posicion;
    private String piePreferido;
    private int rating;

    public Jugador(String nombre, String nacionalidad, double peso, LocalDate fechaNacimiento, 
                   String posicion, String piePreferido, int rating) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
        this.posicion = posicion;
        this.piePreferido = piePreferido;
        this.rating = rating;
    }

    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }
    public double getPeso() { return peso; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public String getPosicion() { return posicion; }
    public String getPiePreferido() { return piePreferido; }
    public int getRating() { return rating; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
    public void setPeso(double peso) { this.peso = peso; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public void setPosicion(String posicion) { this.posicion = posicion; }
    public void setPiePreferido(String piePreferido) { this.piePreferido = piePreferido; }
    public void setRating(int rating) { this.rating = rating; }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }
}
