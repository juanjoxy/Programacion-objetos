package p113_SegundoExamenParcial;

public class CamionCarga extends Vehiculo {
    private int ejes;
    private double kilometraje;

    public CamionCarga(String marca, String modelo, int capacidad, double costoBase, int ejes, double kilometraje) {
        super(marca, modelo, capacidad, costoBase);
        this.ejes = ejes;
        this.kilometraje = kilometraje;
        this.costoTotal = this.costoBase + getBonoConductor();
    }

    @Override
    public double getBonoConductor() {
        return (costoBase * 0.10) + (ejes * 50) + (kilometraje * 0.5);
    }

    @Override
    public String toString() {
        return String.format("CamionCarga [%s, Ejes=%d, Kilometraje=%.1f, Bono=%.1f, CostoTotal=%.1f]",
                             super.toString(), ejes, kilometraje, getBonoConductor(), costoTotal);
    }
}