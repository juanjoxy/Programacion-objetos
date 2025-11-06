package p139_ArchivoEstudiantes;
import java.io.Serializable;

public class Estudiante implements Serializable {
    private String nombre;
    private int edad;
    private double promedio;
    private String sexo; // "H" para hombre, "M" para mujer

    public Estudiante() {}

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { this.promedio = promedio; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + 
               ", promedio=" + promedio + ", sexo=" + sexo + "]";
    }
}
