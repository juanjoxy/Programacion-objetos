package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Flota {
    private String nombre;
    private String ciudad;
    private ArrayList<Vehiculo> vehiculos;

    public Flota(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public double getTotalBono() {
        double total = 0;
        for (Vehiculo v : vehiculos) {
            total += v.getBonoConductor();
        }
        return total;
    }

    public double getTotalCosto() {
        double total = 0;
        for (Vehiculo v : vehiculos) {
            total += v.costoTotal;
        }
        return total;
    }

    public int getNumCamiones() {
        int count = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof CamionCarga) count++;
        }
        return count;
    }

    public int getNumAutobuses() {
        int count = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof AutobusPasajeros) count++;
        }
        return count;
    }

    public void reporte() {
        System.out.println(">> Reporte Detallado de la Flota <<");
        for (Vehiculo v : vehiculos) {
            System.out.println(v.toString());
        }
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format("Flota [Nombre=%s, Ciudad=%s, Vehiculos=%d, BonoTotal=%.1f, CostoTotal=%.1f, Camiones=%d, Autobuses=%d]",
                             nombre, ciudad, vehiculos.size(), getTotalBono(), getTotalCosto(),
                             getNumCamiones(), getNumAutobuses());
    }
}