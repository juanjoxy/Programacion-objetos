package p113_SegundoExamenParcial;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int capacidad;
    protected double costoBase;
    protected double costoTotal;

    public Vehiculo(String marca, String modelo, int capacidad, double costoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.costoBase = costoBase;
        this.costoTotal = this.costoBase + getBonoConductor();
    }

    public abstract double getBonoConductor();

    @Override
    public String toString() {
        return String.format("Vehiculo [Marca=%s, Modelo=%s, Capacidad=%d, CostoBase=%.2f]",
                             marca, modelo, capacidad, costoBase);
    }
}