package p111_CuentaBancariaV2;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private String domicilio;
    private ArrayList<Cliente> clientes;

    public Banco() {
        clientes = new ArrayList<>();
    }

    public Banco(String nombre, String domicilio) {
        this();
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public double getTotal() {
        double total = 0;
        for (Cliente cliente : clientes)
            total += cliente.getTotal();
        return total;
    }

    public void reporte() {
        for (Cliente cliente : clientes) {
            System.out.println("> " + cliente);
            for (CuentaBancaria cuenta : cliente.getCuentas()) {
                System.out.println("  - " + cuenta);
            }
            if (!cliente.getCuentas().isEmpty()) System.out.println();
        }
    }

    public void calcularInteres() {
        for (Cliente cliente : clientes) {
            for (CuentaBancaria cuenta : cliente.getCuentas()) {
                if (cuenta instanceof CuentaDeAhorro) {
                    ((CuentaDeAhorro) cuenta).calcularInteres();
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Banco [Nombre = %s, Domicilio = %s, Clientes = %d, Total = %.2f]",
                nombre, domicilio, clientes.size(), getTotal());
    }
}
