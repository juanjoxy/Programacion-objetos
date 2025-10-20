package p113_SegundoExamenParcial;

public class AutobusPasajeros extends Vehiculo {
    private int rutas;
    private int pasajerosTransportados;

    public AutobusPasajeros(String marca, String modelo, int capacidad, double costoBase, int rutas, int pasajerosTransportados) {
        super(marca, modelo, capacidad, costoBase);
        this.rutas = rutas;
        this.pasajerosTransportados = pasajerosTransportados;
        this.costoTotal = this.costoBase + getBonoConductor();
    }

    @Override
    public double getBonoConductor() {
        return (costoBase * 0.15) + (rutas * 120) + (pasajerosTransportados * 0.1);
    }

    @Override
    public String toString() {
        return String.format("AutobusPasajeros [%s, Rutas=%d, PasajerosTransportados=%d, Bono=%.1f, CostoTotal=%.1f]",
                             super.toString(), rutas, pasajerosTransportados, getBonoConductor(), costoTotal);
    }
}